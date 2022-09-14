import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

Upper u = new Upper();

    @Test
    public void testSomething() {
       assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
