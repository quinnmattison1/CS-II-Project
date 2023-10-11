import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest9 {

    @Test
    public void test9A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query9.Query9(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query9_2020.txt");
            try {
                TestUtilities.checkUnordered(expected, results);
            } catch (AssertionError e) {
                expected.remove("VI,American Airlines Inc.");
                expected.add("VI,Cape Air");
                TestUtilities.checkUnordered(expected, results);
            }
        }
    }

    @Test
    public void test9B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            Iterable<String> results = Query9.Query9(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query9_1990.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test9C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query9.Query9(input);
            Set<String> expected = TestUtilities.getExpectedResults2Col("queries/query9_2005.txt");
            try {
                TestUtilities.checkUnordered(expected, results);
            } catch (AssertionError e) {
                expected.remove("WA,Alaska Airlines Inc.");
                expected.add("WA,Southwest Airlines Co.");
                TestUtilities.checkUnordered(expected, results);
            }
        }
    }
}
