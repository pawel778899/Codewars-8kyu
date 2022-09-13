import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testSomething() {
        assertEquals(Solution.check(new Object[] {66, 101}, 66), true);
        assertEquals(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }

}
