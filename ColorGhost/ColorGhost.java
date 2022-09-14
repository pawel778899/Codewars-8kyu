public class Ghost {
    public Ghost() {}

    public String getColor() {
        String[] array = {"white", "yellow", "purple", "red"};
        return array[(int) (Math.random() * array.length)];
    }
}





// DESCRIPTION:
// Color Ghost
// Create a class Ghost

// Ghost objects are instantiated without any arguments.

// Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

// Ghost ghost = new Ghost();
// ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
// OBJECT-ORIENTED PROGRAMMING FUNDAMENTALS
