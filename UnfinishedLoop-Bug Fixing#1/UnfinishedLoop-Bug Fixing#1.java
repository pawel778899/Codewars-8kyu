//Solution 1

import static java.util.stream.IntStream.range;

import java.util.List;

public class Kata {
  List<Integer> CreateList(int number) {
    return range(1, ++number).boxed().toList();
  }
}

//Solution 2

import java.util.*;

class Kata {
  public static List CreateList(int number)
  {
    List list = new ArrayList<>();
    
    for(int count = 1; count <= number; count++)
    {
      list.add(count);
    }
    
    return list;
  }
}




// DESCRIPTION:
// Unfinished Loop - Bug Fixing #1
// Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

// DEBUGGING
