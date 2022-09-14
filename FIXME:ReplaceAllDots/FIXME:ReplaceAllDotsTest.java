import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SolutionTests {

  @Test
  public void testSomeDots() {
    assertTrue("Sorry, try again :-(", "one-two-three".equals(Dinglemouse.replaceDots("one.two.three")));
  }

}
