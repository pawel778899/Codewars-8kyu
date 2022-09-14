import java.util.Arrays;
public class ZywOo {
  public static int[] take(int[] arr, int n) {
    return n > arr.length ? arr : Arrays.copyOf(arr, n);
  }
}



// DESCRIPTION:
// Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

// If you need help, here's a reference:

// https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)

// FUNDAMENTALS
