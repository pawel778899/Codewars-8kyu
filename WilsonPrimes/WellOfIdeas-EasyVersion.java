//Solution 1

import static java.util.stream.Stream.of;

public class Kata {
  public static String well(String[] ideas) {
    long count = of(ideas).filter(i -> i.equals("good")).count();
    return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
  }
}

//Solution 2

public class Kata {

  public static String well(String[] x) {
      int count = 0;
      for (String s : x) {
         if (s.equals("good")) count++;
         if (count > 2) return "I smell a series!";
      }
      if (count != 0) return "Publish!";
      return "Fail!";
  }

}




// DESCRIPTION:
// For every good kata idea there seem to be quite a few bad ones!

// In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.

// FUNDAMENTALS ARRAYS STRINGS REFACTORING
