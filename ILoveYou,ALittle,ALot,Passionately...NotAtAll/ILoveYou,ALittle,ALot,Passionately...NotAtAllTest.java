import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Random;

public class SampleTests {
    @Test
    public void test1() {
        assertEquals(Sid.howMuchILoveYou(1), "I love you");
        assertEquals(Sid.howMuchILoveYou(2), "a little");
        assertEquals(Sid.howMuchILoveYou(6), "not at all");
    }
}
