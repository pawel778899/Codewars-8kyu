import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ConverterTest {
  
    @Test
    public void testHoopCount() {
        assertEquals(1, Converter.binToDecimal("1"));
        assertEquals(0, Converter.binToDecimal("0"));
        assertEquals(73, Converter.binToDecimal("1001001"));
        }
  }
