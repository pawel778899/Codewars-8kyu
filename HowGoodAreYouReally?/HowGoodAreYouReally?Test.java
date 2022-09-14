import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataExampleTests {
  @Test
  public void tests() {
    assertEquals(true, Kata.betterThanAverage(new int[] {2, 3}, 5));
    assertEquals(true, Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    assertEquals(true, Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
    assertEquals(false, Kata.betterThanAverage(new int[] {100, 90}, 11));
  }
}
