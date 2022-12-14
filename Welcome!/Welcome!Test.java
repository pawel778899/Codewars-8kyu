import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Welcome.greet("english"));
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
        assertEquals("Your function should have returned 'Failte'. Try again.", "Failte", Welcome.greet("irish"));
        assertEquals("Your function should have returned 'xxxxx'. Try again.", "Welcome", Welcome.greet("english"));
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }
}
