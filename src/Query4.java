import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Query4 {

    public static Iterable<String> Query4(Iterable<FlightRecord> input) {
        Map<String, Integer> map = new TreeMap<>();
        for (FlightRecord elem : input) {
            if (elem.ORIGIN.equals("CID")) {
                String dest = elem.DEST;
                int num = map.getOrDefault(dest, 0);
                map.put(dest, num + 1);
            }
        }
        List<String> output = new LinkedList<>();
        for (String element : map.keySet()) {
            int num = map.get(element);
            output.add(element + "=" + num);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> data = DataImporter.getData("flights/flights2005.csv");
        Iterable<String> output = Query4(data);
        for (String elem : output) {
            System.out.println(elem);
        }
    }

}
