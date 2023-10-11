import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Query8 {
    public static Iterable<String> Query8(Iterable<FlightRecord> input) {
        Map<String, Integer> map1 = new HashMap<>(); // keep track of intra-state flights for each state
        Map<String, Integer> map2 = new HashMap<>(); // keep track of total flights for each state

        // iterate over all flights
        for (FlightRecord element : input) {
            String origin = element.ORIGIN_STATE_ABR;
            String dest = element.DEST_STATE_ABR;
            if (origin.equals(dest)) { // intra-state flight
                map1.put(origin, map1.getOrDefault(origin, 0) + 1);
            }
            map2.put(origin, map2.getOrDefault(origin, 0) + 1);
            map2.put(dest, map2.getOrDefault(dest, 0) + 1);
        }

        // calculate the percentage of intra-state flights for each state and format the result
        DecimalFormat x = new DecimalFormat("#.000");
        Iterable<String> output = map1.entrySet().stream().map(entry -> {
            String string = entry.getKey();
            int y = 2 * entry.getValue();
            int z = map2.get(string);
            double val = (double)y / z;
            String val2 = x.format(val);
            return string + "=" + val2;
        }).sorted().toList();

        return output;
    }



    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
        Iterable<String> rs = Query8(input);
        for (String r : rs) {
            System.out.println(r);
        }
    }
}