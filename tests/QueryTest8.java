import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest8 {

    @Test
    public void test8A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query8.Query8(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query8_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }


    @Test
    public void test8B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            Iterable<String> results = Query8.Query8(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query8_1990.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }


    @Test
    public void test8C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query8.Query8(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query8_2005.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
}