import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FileTests {
  @Test
  public void testGetFiles() throws IOException {
    Assert.assertEquals(
        List.of(new File("testdir/a.txt")), FileExample.getFiles(new File("testdir/a.txt")));
    //this is the first test to fail
    List<File> expected2 =
        List.of(
            new File("testdir/a.txt"),
            new File("testdir/b/c.txt"),
            new File("testdir/b/d/e.txt"),
            new File("testdir/b/d/f.txt"));
    Assert.assertEquals(expected2, FileExample.getFiles(new File("testdir")));
  }
}
