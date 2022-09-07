public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) { 
    int sheeps =0;
    for(Boolean sheep : arrayOfSheeps)
      if(sheep != null && sheep == true)
        sheeps++;
      return sheeps;
    
  }
}



// DESCRIPTION:
// Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

// For example,

// [true,  true,  true,  false,
//   true,  true,  true,  true ,
//   true,  false, true,  false,
//   true,  false, false, true ,
//   true,  true,  true,  true ,
//   false, false, true,  true]
// The correct answer would be 17.

// Hint: Don't forget to check for bad values like null/undefined

// ARRAYS FUNDAMENTALS
