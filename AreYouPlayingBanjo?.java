//Solution 1
public class Banjo 
{
  public static String areYouPlayingBanjo(String name) 
  {
    if( name.toUpperCase().startsWith("R") )
      return name + " plays banjo";
    else
      return name + " does not play banjo";
  }
}

//Solution 2

public class Banjo {
  public static String areYouPlayingBanjo(String name) {

    if(name.substring(0,1).equals("r") || name.substring(0,1).equals("R")){
            return name + " plays banjo";
        }else{
            return name + " does not play banjo";
        }
  }
  
  DESCRIPTION:
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.

STRINGS FUNDAMENTALS
  
