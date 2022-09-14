import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class GoalsTest {
    @Test
    public void BasicTests() {
        assertEquals(58, Goals.totalGoals);
    }
}
