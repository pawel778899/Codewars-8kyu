//Solution 1

public class Kata
{
  public static String position(char alphabet)
  {
    return "Position of alphabet: " + ((int) alphabet - 96);
  }
}

//Solution 2

public class Kata
{
 public static String position(char alphabet) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int position = 0;
        System.out.println(chars.length);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == alphabet) position = ++i;
        }
        return String.format("%s: %s", "Position of alphabet", String.valueOf(position));
    }
  }
