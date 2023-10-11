import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Query1 {

    public static int Query1(Iterable<FlightRecord> input) {
        int output = 0;

        for (FlightRecord record : input) {

            if (record.ORIGIN.equals("CID")) {
                output++;
            }

        }

        return output;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
        int total = Query1(input);
        System.out.println(total);
    }
}
