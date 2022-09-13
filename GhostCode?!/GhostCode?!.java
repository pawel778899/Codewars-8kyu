//solution 1

public class GhostCode{
  public static String helloName(String name) {
    return "Hello " + (name == null || name.isEmpty() ? "world!" : "my name is " + name);
  }
}

//Solution 2

public class GhostCode{
  public static String helloName(final String name){
    if(name == null || name.equals(""))
      return "Hello world!";
    else
      return "Hello my name is " + name;
  }
}


// DESCRIPTION:
// Trollencio changed my code! can you fix it? My name is not "dumb!" o( TT_TT )o

// Instructions: Fix the code

// Input
// Javatlacati
// Output
// Hello my name is Javatlacati
// Input
// ""
// Output
// Hello world!
// UNICODE DEBUGGING
