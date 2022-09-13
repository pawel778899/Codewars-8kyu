import static java.util.Arrays.stream;

public class ReverseWords {
  public static String reverseWords(String str) {
    return stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
  }
}





// DESCRIPTION:
// Complete the solution so that it reverses all of the words within the string passed in.

// Example(Input --> Output):

// "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
// STRINGS ALGORITHMS
