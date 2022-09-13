//Solution 1

import static java.util.stream.IntStream.of;

public class School{
  public static int getAverage(int[] marks) {
    return (int) of(marks).average().orElse(0);
  }
}

//Solution 2

public class School{

  public static int getAverage(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
   
    return sum / marks.length;
  }

}





// DESCRIPTION:
// It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.

// Return the average of the given array rounded down to its nearest integer.

// The array will never be empty.

// ARRAYS ALGORITHMS
