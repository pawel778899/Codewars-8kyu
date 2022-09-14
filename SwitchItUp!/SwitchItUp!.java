public class Kata
{
  public static String switchItUp(int number)
  {
    
    switch(number) {
            
            case 0:
                System.out.println("Zero");
                return ("Zero");
           case 1:
                System.out.println("One");
                return ("One");
                
            case 2:
                System.out.println("Two");
                return ("Two");
            case 3:
                System.out.println("Three");
                return ("Three");
            case 4:
                System.out.println("Four");
                return ("Four");
            case 5:
                System.out.println("Five");
                return ("Five");
            case 6:
                System.out.println("Six");
                return ("Six");
            case 7:
               System.out.println("Seven");
                return ("Seven");
            case 8:
               System.out.println("Eight");
                return ("Eight");
            case 9:
               System.out.println("Nine");
                return ("Nine");
        
                default:
                System.out.println("Wrong number ! Enter number from 0 to 9");  
        }
    return""; 
    }
  }  




// DESCRIPTION:
// When provided with a number between 0-9, return it in words.

// Input :: 1

// Output :: "One".

// If your language supports it, try using a switch statement.

// FUNDAMENTALS
