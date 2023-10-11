import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Query9 {
    public static Iterable<String> Query9(Iterable<FlightRecord> input) {

        Map<String, Map<String, Integer>> value = new TreeMap<>();
        for (FlightRecord element : input) {
            Map<String, Integer> num = value.computeIfAbsent(element.DEST_STATE_ABR, x -> new TreeMap<>());
            num.put(element.UNIQUE_CARRIER_NAME, num.getOrDefault(element.UNIQUE_CARRIER_NAME, 0) + 1);
        }

        List<String> output = new LinkedList<>();
        for (Map.Entry<String, Map<String, Integer>> elem : value.entrySet()) {
            String key = elem.getKey();
            Map<String, Integer> stateCounts = elem.getValue();
            String max = null;
            int max_count = 0;
            for (Map.Entry<String, Integer> elem2 : stateCounts.entrySet()) {
                String airline = elem2.getKey();
                int val2 = elem2.getValue();
                if (val2 > max_count) {
                    max = airline;
                    max_count = val2;
                }
            }
            output.add(key + "," + max);
        }

        return output;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
        Iterable<String> rs = Query9(input);
        for (String r : rs) {
            System.out.println(r);
        }
    }
}