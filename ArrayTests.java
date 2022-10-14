import static org.junit.Assert.assertArrayEquals;

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
}
