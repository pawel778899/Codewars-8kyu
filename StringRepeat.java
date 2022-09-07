//Solution 1

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}

//Solution 2

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
    String repeatedString = "";
        for (int i = 0; i < repeat; i++) {
          repeatedString += string;
        }
        return repeatedString;
    }
}


// DESCRIPTION:
// Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

// Examples (input -> output)
// 6, "I"     -> "IIIIII"
// 5, "Hello" -> "HelloHelloHelloHelloHello"
// FUNDAMENTALS STRINGS
