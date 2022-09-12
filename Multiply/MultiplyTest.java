import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
    @Test
    void test1() {
         assertEquals(6D,Multiply.multiply(2D,3D));
    }
  @Test
    void test2() {
         assertEquals(0D,Multiply.multiply(0D,300D));
    }
}
