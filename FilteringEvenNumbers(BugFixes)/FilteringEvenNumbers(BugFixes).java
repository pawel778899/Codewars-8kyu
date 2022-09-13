import java.util.List;

interface Kata13December {
  static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
    return listOfNumbers.stream().filter(x -> x % 2 != 0).toList();
  }
}




// DESCRIPTION:
// Fix the bug in Filtering method
// The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.

// However, there is a bug in the method that needs to be resolved.

// FUNDAMENTALS DEBUGGING
