public class Kata{
  public static int grow(int[] x){
    int a=1;
    for(int i=0; i<x.length; i++){
     
      a=a*x[i];
    }
    return a;  
  }
}



// DESCRIPTION:
// Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
// FUNDAMENTALS ARRAYS
