public class Maps {
  public static int[] map(int[] arr) {  
    int x = 0;
    while (x < arr.length) {
        arr[x] = arr[x] * 2;
        x++;
    }
    return arr; 
  }
}



// DESCRIPTION:
// Given an array of integers, return a new array with each value doubled.

// For example:

// [1, 2, 3] --> [2, 4, 6]

// FUNDAMENTALS ARRAYS
