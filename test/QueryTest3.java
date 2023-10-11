import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

public class QueryTest3 {

    @Test
    public void test3A() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights1990.csv");
            int result = Query3.Query3(input);
            Assert.assertEquals(57, result);
        }
    }

    @Test
    public void test3B() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2005.csv");
            int result = Query3.Query3(input);
            Assert.assertEquals(87, result);
        }
    }

    @Test
    public void test3C() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            int result = Query3.Query3(input);
            Assert.assertEquals(63, result);
        }
    }

    @Test
    public void testSuperMega3() throws IOException {
        {
            Iterable<FlightRecord> input = DataImporter.getData("flights/flights2020.csv");
            int result = Query3.Query3(input);
            Assert.assertEquals(63, result);
        }
    }

    @Test
    public void test3ABC() throws IOException {
        {
            Iterable<FlightRecord> input = TestUtilities.allInput();
            int result = Query3.Query3(input);
            Assert.assertEquals(129, result);
        }
    }
}