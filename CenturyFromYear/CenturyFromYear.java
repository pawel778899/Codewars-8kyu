//Solution 1

public class Solution {
  public static int century(int number) {
    return (number + 99) / 100;
  }
}

//Solution 2

public class Solution {
  public static int century(int number) {
    
  int sum = 0;
  while (number > 0){
    number = number - 100;
    sum = sum + 1;
  }
  return sum;        
    }        
  }


// DESCRIPTION:
// Introduction
// The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

// Task
// Given a year, return the century it is in.

// Examples
// 1705 --> 18
// 1900 --> 19
// 1601 --> 17
// 2000 --> 20
// FUNDAMENTALS MATHEMATICS DATE TIME
