import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
    }
}
