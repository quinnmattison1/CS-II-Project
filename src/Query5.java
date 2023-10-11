import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Query5 {
    public static String Query5(Iterable<FlightRecord> input) {
        Map<Integer, Integer> data = new TreeMap<>();
        for (FlightRecord elem : input) {
            int key = elem.MONTH;
            int flights = data.getOrDefault(key, 0);
            data.put(key, flights + 1);
        }
        int month = 0;
        int num = 0;
        for (int key : data.keySet()) {
            int flights = data.get(key);
            if (flights > num) {
                month = key;
                num = flights;
            }
        }
        return month + " had " + num + " flights";
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
        String r = Query5(input);
        System.out.println(r);
    }
}
