public class Kata{
  public static double find_average(int[] array){
    int length = array.length;
    double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
    return average;
 }    
}




// DESCRIPTION:
// Write a function which calculates the average of the numbers in a given list.

// Note: Empty arrays should return 0.

// FUNDAMENTALS FUNCTIONAL PROGRAMMING
