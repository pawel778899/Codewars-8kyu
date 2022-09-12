namespace Solution {
  using NUnit.Framework;
  using System;

  [TestFixture]
  public class SolutionTest
  {
    [Test]
    public void SampleTest()
    {
      Assert.AreEqual(9, Kata.Index(new int[] {1, 2, 3, 4}, 2));
      Assert.AreEqual(1000000, Kata.Index(new int[] {1, 3, 10, 100}, 3));
    }
  }
}
