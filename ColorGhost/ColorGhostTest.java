import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;


class SolutionTest {
  @Test
  void sample() {
    var colors = List.of("red", "yellow", "purple", "white");
    assertTrue(colors.contains(new Ghost().getColor()));
  }
}
