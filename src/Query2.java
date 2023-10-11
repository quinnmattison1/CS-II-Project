import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Query2 {

    public static Iterable<String> Query2(Iterable<FlightRecord> input) {

        Set<String> places = new HashSet<>();

        for (FlightRecord record : input) {

            if (record.ORIGIN.equals("CID")) {
                String place = record.DEST + ", " + record.DEST_STATE_ABR;
                places.add(place);
            }

        }
        List<String> output = new ArrayList<>(places);

        Collections.sort(output);
        
        return output;
    }

    public static void main(String[] args) throws IOException {
        Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
        Iterable<String> results = Query2(input);
        for (String s : results) {
            System.out.println(s);
        }
    }
}
