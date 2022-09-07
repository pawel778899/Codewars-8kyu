public class Kata {
  public static int[] invert(int[] array) {
  int x = 0;
    while (x < array.length) {
        array[x] = array[x] * -1;
        x++;
    }
    return array;
  }
}



// DESCRIPTION:
// Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

// invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
// invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
// invert([]) == []
// LISTS FUNDAMENTALS
