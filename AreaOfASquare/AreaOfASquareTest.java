import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
private static final double DELTA = 1e-15;
    @Test
    public void basicTests() {
        assertEquals(1.62, Geometry.squareArea(2),DELTA);
        assertEquals(0, Geometry.squareArea(0),DELTA);
        assertEquals(80, Geometry.squareArea(14.05),DELTA);
    }
}
