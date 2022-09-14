//Solution 1

public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int surfaceArea = 2 * (w * h + h * d + w * d);
        int volume = w * h * d;
        return new int[] {surfaceArea, volume};
    }
}

//Solution 2

public class Kata {
    public static int[] getSize(int w,int h,int d) {

      return new int[]{2 * (w * h + h * d + w * d), w * h * d};
    }
}





// DESCRIPTION:
// Write a function that returns the total surface area and volume of a box as an array: [area, volume]

// GEOMETRY FUNDAMENTALS
