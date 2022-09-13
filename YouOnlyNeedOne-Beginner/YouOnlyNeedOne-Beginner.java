import static java.util.List.of;

interface Solution {
  static boolean check(Object[] a, Object x) {
    return of(a).contains(x);
  }
}





// DESCRIPTION:
// You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

// Array can contain numbers or strings. X can be either.

// Return true if the array contains the value, false if not.

// FUNDAMENTALS STRINGS ARRAYS
