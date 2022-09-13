//Solution 1

public class Kata {
    public static int nextId(int[] ids) {
        int minId = 0;
        for (int i = 0; i < ids.length;) {
            if (minId == ids[i]) {
                minId += 1;
                i = 0;
            } else {
                i++;
            }
        }
        return minId;
    }
}

//Solution 2
import java.util.stream.IntStream;

public class Kata {
  public static int nextId(int[] ids) {
    return IntStream.range(0, ids.length + 1).filter(id -> !IntStream.of(ids).anyMatch(x -> x == id)).findFirst().getAsInt();
  }
}




// DESCRIPTION:
// Hey awesome programmer!

// You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!

// Therefore you need a method, which returns the smallest unused ID for your next new data item...

// Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!

// Go on and code some pure awesomeness!

// FUNDAMENTALS ALGORITHMS
