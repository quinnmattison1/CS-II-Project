import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest4 {

    @Test
    public void test4A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query4.Query4(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query4_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test4B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            Iterable<String> results = Query4.Query4(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query4_1990.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test4C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query4.Query4(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query4_2005.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
}