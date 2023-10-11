import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest7 {

    @Test
    public void test7A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test7B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test7C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test7D() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }

    }

    @Test
    public void test7E() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2020.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test7F() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_1990.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }

    @Test
    public void test7G() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            Iterable<String> results = Query7.Query7(input);
            Set<String> expected = TestUtilities.getExpectedResults1Col("queries/query7_2005.txt");
            TestUtilities.checkUnordered(expected, results);
        }
    }
}