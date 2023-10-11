import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest10 {

    @Test
    public void test10A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query10.Query10(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query10_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
    
    @Test
    public void test10B() throws IOException {
        {
            {
                Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
                Iterable<String> results = Query10.Query10(input);
                Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query10_1990.txt");
                TestUtilities.checkUnordered(expected, results);
            }
        }
    }

    @Test
        public void test10C() throws IOException {

                {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query10.Query10(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query10_2005.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
}
