import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest0 {
    @Test
    public void test0A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            int result = Query0.Query0(input);
            Assert.assertEquals(2, result);
        }
    }

    @Test
    public void test0B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            int result = Query0.Query0(input);
            Assert.assertEquals(5, result);
        }
    }

    @Test
    public void test0C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            int result = Query0.Query0(input);
            Assert.assertEquals(6, result);
        }
    }

    @Test
    public void testSuperMega0() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/supermega.csv");
            int result = Query0.Query0(input);
            Assert.assertEquals(13, result);
        }
    }

    @Test
    public void test0ABC() throws IOException {
        {
            Iterable<FlightRecord> input = TestUtilities.allInput();
            int result = Query0.Query0(input);
            Assert.assertEquals(13, result);
        }
    }

}
