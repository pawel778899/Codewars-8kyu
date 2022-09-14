import java.util.stream.*;
import java.util.Arrays;
import java.lang.reflect.Array;
 

public class ArrayPrinter {

    public static String printArray(Object array) {
      return IntStream.range(0, Array.getLength(array)).mapToObj(i -> String.valueOf(Array.get(array, i))).collect(Collectors.joining(","));
    }
}



// DESCRIPTION:
// Input: Array of elements

// ["h","o","l","a"]

// Output: String with comma delimited elements of the array in th same order.

// "h,o,l,a"

// Note: if this seems too simple for you try the next level

// ARRAYS FUNDAMENTALS
