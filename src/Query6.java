import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Query6 {
    public static String Query6(Iterable<FlightRecord> input) {
        Map<String, Integer> pairs = new TreeMap<>();
        for (FlightRecord element : input) {
            String origin = element.ORIGIN_STATE_ABR;
            String dest = element.DEST_STATE_ABR;
            String pair;
            if (origin.compareTo(dest) < 0) {
                pair = "(" + origin + "," + dest + ")";
            } else {
                pair = "(" + dest + "," + origin + ")";
            }
            int num = pairs.getOrDefault(pair, 0);
            pairs.put(pair, num + 1);
        }
        String max = null;
        int value = 0;
        for (String elem : pairs.keySet()) {
            int i = pairs.get(elem);
            if (i > value) {
                max = elem;
                value = i;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
        String r = Query6(input);
        System.out.println(r);
    }
}
