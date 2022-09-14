//Solution 1
public class WideMouthedFrog {
  public static String mouthSize(String animal) {
    return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
  }
}

//Solution 2

public class WideMouthedFrog{
  public static String mouthSize(String animal){
   
    if (animal.equalsIgnoreCase("alligator")) {
     
     return "small";
   }
    else {
      return "wide";
    }
  }
}


// DESCRIPTION:
// The wide-mouth frog is particularly interested in the eating habits of other creatures.

// He just can't stop asking the creatures he encounters what they like to eat. But, then he meets the alligator who just LOVES to eat wide-mouthed frogs!

// When he meets the alligator, it then makes a tiny mouth.

// Your goal in this kata is to create complete the mouth_size method this method takes one argument animal which corresponds to the animal encountered by the frog. If this one is an alligator (case-insensitive) return small otherwise return wide

// STRINGS LOGIC FUNDAMENTALS
