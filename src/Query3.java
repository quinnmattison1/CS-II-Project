import java.io.IOException;
import java.util.*;

public class Query3 {

    public static int Query3(Iterable<FlightRecord> input) {
        Set<String> output = new HashSet<>();
        for (FlightRecord record : input) {
            if (record.ORIGIN.equals("CID")) {
                output.add(record.DEST);
            }
        }
        return output.size();
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> data = DataImporter.getData("flights/flights2020.csv");
        int output = Query3(data);
        System.out.println(output);
    }

}
