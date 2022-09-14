//Solution 1

public class AgeDiff {

  public static String CalculateAge(int birth, int year) {
    final int age = year - birth;    
    return 
      age == 0 ? "You were born this very year!" :
      age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
      String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
  }
}

//Solution 2

public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    
    return birth == yearTo ? "You were born this very year!" : birth < yearTo ?
                String.format("You are %s year%s old.", yearTo - birth, (yearTo - birth == 1 ? "" : "s")) :
                String.format("You will be born in %s year%s.", Math.abs(yearTo - birth), (Math.abs(yearTo - birth) == 1 ? "" : "s"));
  }
}





// DESCRIPTION:
// Philip's just turned four and he wants to know how old he will be in various years in the future such as 2090 or 3044. His parents can't keep up calculating this so they've begged you to help them out by writing a programme that can answer Philip's endless questions.

// Your task is to write a function that takes two parameters: the year of birth and the year to count years in relation to. As Philip is getting more curious every day he may soon want to know how many years it was until he would be born, so your function needs to work with both dates in the future and in the past.

// Provide output in this format: For dates in the future: "You are ... year(s) old." For dates in the past: "You will be born in ... year(s)." If the year of birth equals the year requested return: "You were born this very year!"

// "..." are to be replaced by the number, followed and proceeded by a single space. Mind that you need to account for both "year" and "years", depending on the result.

// Good Luck!

// FUNDAMENTALS
