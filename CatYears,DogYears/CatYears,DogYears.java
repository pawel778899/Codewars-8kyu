//Solution 1


public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int dog = 0;
    int cat = 0;
    if (humanYears >= 1) {
      dog += 15;
      cat += 15;
    }
    if (humanYears >= 2) {
      dog += 9;
      cat += 9;
    }
    if (humanYears > 2) {
      dog += 5 * (humanYears - 2);
      cat += 4 * (humanYears - 2);
    }
    return new int[]{humanYears,cat,dog};
  }

}


//Solution 2

public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    return new int[] {humanYears, humanYears > 1 ? 16 + 4 * humanYears : 15, humanYears > 1 ? 14 + 5 * humanYears : 15};
  }
}





// DESCRIPTION:

// Kata Task
// I have a cat and a dog.

// I got them at the same time as kitten/puppy. That was humanYears years ago.

// Return their respective ages now as [humanYears,catYears,dogYears]

// NOTES:

// humanYears >= 1
// humanYears are whole numbers only
// Cat Years
// 15 cat years for first year
// +9 cat years for second year
// +4 cat years for each year after that
// Dog Years
// 15 dog years for first year
// +9 dog years for second year
// +5 dog years for each year after that
// References

// http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
// http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html
// If you liked this Kata there is another related one here

// FUNDAMENTALS


