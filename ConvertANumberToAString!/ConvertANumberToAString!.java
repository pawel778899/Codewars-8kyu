//Solution 1

class Kata {
  public static String numberToString(int num) {
     return ""+num;
  }
}

//Solution 2

class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}

//Solution 3

class Kata {
  public static String numberToString(int num) {
    
    
    return String.valueOf(num);
  }
}
//Solution 4

class Kata {
  public static String numberToString(int num) {
    return String.format("%d", num);
  }
}



// DESCRIPTION:
// We need a function that can transform a number (integer) into a string.

// What ways of achieving this do you know?

// Examples (input --> output):
// 123  --> "123"
// 999  --> "999"
// -100 --> "-100"
// STRINGS FUNDAMENTALS
