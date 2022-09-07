public class Solution{
  public static String doubleChar(String s){ 
String sum="";   
    for(int i=0;i<s.length();i++){
    sum=sum+s.charAt(i)+ s.charAt(i);
    }
return sum;
  }
}

// DESCRIPTION:
// Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

// Examples (Input -> Output):
// * "String"      -> "SSttrriinngg"
// * "Hello World" -> "HHeelllloo  WWoorrlldd"
// * "1234!_ "     -> "11223344!!__  "
// Good Luck!

// FUNDAMENTALS
