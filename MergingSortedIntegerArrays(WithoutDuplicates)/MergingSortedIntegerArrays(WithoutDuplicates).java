//Solution 1

import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;

public class Kata {
  public static int[] mergeArrays(int[] a, int[] b) {
    return concat(of(a), of(b)).sorted().distinct().toArray();
  }
}

//Solution 2

import java.util.stream.*;
public class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
    return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
  }
}




// DESCRIPTION:
// Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.

// ARRAYS FUNDAMENTALS
