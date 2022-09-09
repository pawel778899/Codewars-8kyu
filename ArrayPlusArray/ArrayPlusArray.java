//Solution 1
  
import java.util.stream.*;
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
  }

}


//Solution 2

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {

    int sum1=0;
    for (int num1:arr1){
      sum1+=num1;
    }
    
    int sum2=0;
    for (int num2:arr2){
      sum1+=num2;
    }
    
    return sum1 + sum2;
  }
}






// DESCRIPTION:
// I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.

// P.S. Each array includes only integer numbers. Output is a number too.

// FUNDAMENTALS ARRAYS DEBUGGING
