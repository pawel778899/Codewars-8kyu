class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}






// DESCRIPTION:
// I would like to be able to pass an array with two elements to my swapValues function to swap the values. However it appears that the values aren't changing.

// Can you figure out what's wrong here?

// DEBUGGING ARRAYS FUNDAMENTALS
