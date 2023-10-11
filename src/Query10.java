import java.io.IOException;
import java.util.*;

public class Query10 {

    public static Iterable<String> Query10(Iterable<FlightRecord> input) {

        Map<String, List<FlightRecord>> map1 = new HashMap<>();
        Map<String, List<FlightRecord>> map2 = new HashMap<>();
        for (FlightRecord elem : input) {
            String origin = elem.ORIGIN;
            String dest = elem.DEST;
            List<FlightRecord> list1 = map1.computeIfAbsent(origin, x -> new ArrayList<>());
            list1.add(elem);
            List<FlightRecord> list2 = map2.computeIfAbsent(dest, x -> new ArrayList<>());
            list2.add(elem);
        }


        Set<String> output = new HashSet<>();
        List<FlightRecord> list3 = map1.get("CID");
        if (list3 != null) {
            for (FlightRecord first : list3) {
                String string = first.DEST;
                List<FlightRecord> list4 = map2.get("LAX");
                if (list4 != null) {
                    for (FlightRecord elem2 : list4) {
                        if (elem2.ORIGIN.equals(string)) {
                            String string2 = String.format("%s->%s->%s", first.ORIGIN, first.DEST, elem2.DEST);
                            output.add(string2);
                        }
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
        Timer t = new Timer();
        t.start();
        Iterable<String> results = Query10(input);
        t.end();
        for (String s : results) {
            System.out.println(s);
        }
        System.out.println(t.elapsedSeconds());
    }
}
