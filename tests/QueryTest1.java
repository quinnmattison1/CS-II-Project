import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest1 {

    @Test
    public void test1A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            int total = Query1.Query1(input);
            Assert.assertEquals(275, total);
        }
    }
    @Test
    public void test1B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            int total = Query1.Query1(input);
            Assert.assertEquals(409, total);
        }
    }
    @Test
    public void test1C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            int total = Query1.Query1(input);
            Assert.assertEquals(444, total);
        }
    }
}