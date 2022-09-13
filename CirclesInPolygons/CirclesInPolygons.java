class Polygon {
  private final double diameter;

  Polygon(int sides, int sideLength) {
    this.diameter = sideLength / Math.tan(Math.toRadians(180d / sides));
  }

  double circleDiameter() {
    return this.diameter;
  }
}




// DESCRIPTION:
// You are the owner of a box making company.

// Your company can produce any equal sided polygon box, but plenty of your customers want to transport circular objects in these boxes. Circles are a very common shape in the consumer industry. Tin cans, glasses, tyres and CD's are a few examples of these.

// As a result you decide to add this information on your boxes: The largest (diameter) circular object that can fit into a given box.

// MATHEMATICS PUZZLES
