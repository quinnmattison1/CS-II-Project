import java.io.IOException;
import java.util.*;

public class Query7 {
    public static Iterable<String> Query7(Iterable<FlightRecord> input) {
        Set<String> map = new HashSet<>();
        Set<String> output = new HashSet<>();
        for (FlightRecord element : input) {
            output.add(element.ORIGIN_STATE_ABR);
            output.add(element.DEST_STATE_ABR);
            if (element.ORIGIN_STATE_ABR.equals("IA")) {
                map.add(element.DEST_STATE_ABR);
            }
        }
        output.remove("IA");
        output.removeAll(map);
        return output;
    }


    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
        Iterable<String> rs = Query7(input);
        for (String r : rs) {
            System.out.println(r);
        }
    }
}
