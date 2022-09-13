//Solution 1

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    return range(0, one.length()).mapToObj(i -> "" + one.charAt(i) + two.charAt(i) + three.charAt(i)).collect(joining());
  }
}

//Solution 2

public class Kata {
  public static String tripleTrouble(String s1, String s2, String s3) {
    StringBuilder sb = new StringBuilder(s1.length()*3);
    for (int i=0; i<s1.length(); i++) {
      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
    }
    return sb.toString();
  }
}




//DESCRIPTION:
// Triple Trouble
// Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!

// E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

// Note: You can expect all of the inputs to be the same length.

// PUZZLES
