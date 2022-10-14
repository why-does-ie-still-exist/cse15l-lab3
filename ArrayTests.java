import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {3}, input1);
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    // This assertion is the most important: it fails with the original code. The other tests are
    // just making sure it works with 0-length and even-length inputs
    assertArrayEquals(new int[] {3, 2, 1}, input2);
    int[] input3 = {};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] {}, input3);
    int[] input4 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[] {4, 3, 2, 1}, input4);
  }

  @Test
  public void testReversed() {
    int[] input1 = {3};
    // This is the first assertion to fail. reversed returns {0}!
    assertArrayEquals(new int[] {3}, ArrayExamples.reversed(input1));
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[] {3, 2, 1}, ArrayExamples.reversed(input2));
    int[] input3 = {};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input3));
    int[] input4 = {1, 2, 3, 4};
    assertArrayEquals(new int[] {4, 3, 2, 1}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {3d};
    double[] input2 = {};
    double[] input3 = {1d, 2d};
    double[] input4 = {1d, 1d, 2d};
    double[] input5 = {1d, 2d, 3d};
    assertEquals(0d, ArrayExamples.averageWithoutLowest(input1), 0.00001d);
    assertEquals(0d, ArrayExamples.averageWithoutLowest(input2), 0.00001d);
    assertEquals(2d, ArrayExamples.averageWithoutLowest(input3), 0.00001d);
    // This is the first test that fails.
    assertEquals(2d, ArrayExamples.averageWithoutLowest(input4), 0.00001d);
    assertEquals((2d + 3d) / 2, ArrayExamples.averageWithoutLowest(input5), 0.00001d);
  }
}
