import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest5 {

    @Test
    public void test5A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            String result = Query5.Query5(input);
            Assert.assertEquals("9 had 13832 flights", result);
        }
    }

    @Test
    public void test5B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            String result = Query5.Query5(input);
            Assert.assertEquals("6 had 23800 flights", result);
        }
    }

    @Test
    public void test5C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            String result = Query5.Query5(input);
            Assert.assertEquals("1 had 21945 flights", result);
        }
    }

    @Test
    public void testSuperMega5() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            String result = Query5.Query5(input);
            Assert.assertEquals("1 had 21945 flights", result);
        }
    }
}