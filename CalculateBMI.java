public class Calculate {
  public static String bmi(double weight, double height) {
    
    
double bmi = (weight / (height*height));
    
if (bmi <= 18.5) return "Underweight";

else if (bmi <= 25.0) return "Normal";

else if (bmi <= 30.0) return "Overweight";

else if (bmi > 30.0) return "Obese";
    
else {
        return "";
    }    
  }
}




// DESCRIPTION:
// Write function bmi that calculates body mass index (bmi = weight / height2).

// if bmi <= 18.5 return "Underweight"

// if bmi <= 25.0 return "Normal"

// if bmi <= 30.0 return "Overweight"

// if bmi > 30 return "Obese"

// FUNDAMENTALS
