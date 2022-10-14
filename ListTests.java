import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ListTests {
  @Test
  public void testFilter() {
    StringChecker nonempty = (String s) -> !s.isEmpty();
    List<String> input1 = List.of("a", "b", "c");
    // The order should be preserved, but this test fails because it isn't.
    Assert.assertEquals(input1, ListExamples.filter(input1, nonempty));
  }

  @Test
  public void testMerge() {
    List<String> input1 = List.of("a");
    List<String> input2 = List.of("b", "c", "d");
    // This triggers an infinite loop
    Assert.assertEquals(List.of("a", "b", "c", "d"), ListExamples.merge(input1, input2));
  }
}
