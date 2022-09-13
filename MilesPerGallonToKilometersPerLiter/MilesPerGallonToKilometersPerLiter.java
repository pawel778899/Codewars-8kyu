public class Converter {
  public static float mpgToKPM(float mpg) {
    return Math.round(35.4006f * mpg) / 100f;
  }
}



// DESCRIPTION:
// Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.

// Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).

// Make sure to round off the result to two decimal points.

// Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres

// ALGORITHMS
