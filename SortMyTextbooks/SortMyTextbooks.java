//Solution 1
import static java.util.stream.Collectors.toList;

import java.util.List;

public class sorter {
  public static List<String> sort(List<String> textbooks) {
    return textbooks.stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(toList());
  }
}




// DESCRIPTION:
// HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.

// The sorting should NOT be case sensitive

// LISTS SORTING FUNDAMENTALS ARRAYS
