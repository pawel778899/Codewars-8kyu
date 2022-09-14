//Solution 1

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
    //your code here :)
      switch (nb_petals % 6){
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
                default:
                return "";
        }
    }
}

//Solution 2

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
   return nb_petals % 6 == 0 ? "not at all" : new String[]{"I love you", "a little", "a lot", "passionately", "madly"}[(nb_petals % 6) - 1];
    }
}





// DESCRIPTION:
// Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:

// I love you
// a little
// a lot
// passionately
// madly
// not at all
// When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.

// Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals, where nb_petals > 0.

// ARRAYS FUNDAMENTALS
