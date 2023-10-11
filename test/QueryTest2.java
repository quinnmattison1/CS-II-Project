import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest2 {

    @Test
    public void test2A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query2.Query2(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query2_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test2B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            Iterable<String> results = Query2.Query2(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query2_1990.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test2C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query2.Query2(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query2_2005.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
}
