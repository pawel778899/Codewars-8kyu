//Solution 1

public class TrafficLights {

  public static String updateLight(String current) {
    switch (current) {
      case "red": return "green";
      case "yellow": return "red";
      case "green": return "yellow";
      default: throw new IllegalArgumentException();
    }
  }
}

//Solution 2

public class TrafficLights {

  public static String updateLight(String current) {
  
    if (current=="green"){
   return "yellow";
 } else if (current=="yellow"){
   return "red";
 } else{
   return "green";
  }
 }
}



DESCRIPTION:
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.

FUNDAMENTALS
