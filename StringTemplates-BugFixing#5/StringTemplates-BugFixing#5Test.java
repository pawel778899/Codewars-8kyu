import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class BuildStringTest {
    @Test
    public void fixedTests() {
      assertEquals(Kata.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
      assertEquals(Kata.buildString("Cheese","Milk"),"I like Cheese, Milk!");
      assertEquals(Kata.buildString("Chocolate"),"I like Chocolate!");
    }
}
