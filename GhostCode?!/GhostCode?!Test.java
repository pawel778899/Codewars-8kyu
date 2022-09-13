import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GhostCodeTest {
   @Test
  void sample() {
    assertEquals("Hello my name is Javatlacati", GhostCode.helloName("Javatlacati"));
    assertEquals("Hello world!", GhostCode.helloName(null));
    assertEquals("Hello world!", GhostCode.helloName(""));
  }
}
