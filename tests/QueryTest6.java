import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest6 {

    @Test
    public void test6A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            String result = Query6.Query6(input);
            Assert.assertEquals("(CA,CA)", result);
        }
    }

    @Test
    public void test6B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            String result = Query6.Query6(input);
            Assert.assertEquals("(AK,AK)", result);
        }
    }

    @Test
    public void test6C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            String result = Query6.Query6(input);
            Assert.assertEquals("(AK,AK)", result);
        }
    }
}