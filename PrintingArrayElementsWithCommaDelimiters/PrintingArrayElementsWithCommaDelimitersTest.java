import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PersonTest {
    @Test
    public void testInteger() {
    Integer[] array=new Integer[]{2,4,5,2};
      assertEquals("2,4,5,2",ArrayPrinter.printArray(array));
    }
}
