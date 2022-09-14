//Solution 1

public class StringUtils {
  public static boolean isDigit(String s) {
    return s.matches("[0-9]");
  }
}

//Solution 2

public class StringUtils {  
  public static boolean isDigit(String s) {   
    return s.matches("\\d");   
  }
}


// DESCRIPTION:
// Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object is a digit (0-9), false otherwise.

// REGULAR EXPRESSIONS FUNDAMENTALS
