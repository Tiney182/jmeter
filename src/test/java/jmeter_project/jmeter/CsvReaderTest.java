package jmeter_project.jmeter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CsvReaderTest {

  private File file;

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  @Before
  public void setup() throws IOException {
    file = new File("c:/temp/sampleFile.txt");
    file.createNewFile();
  }
  
  @After
  public void deleteTestFile() throws IOException {
    file.delete();
  }

  @Test
  public void setupCsvReaderConstructor_NoFilePassed_ReturnsFileNotFoundException() throws FileNotFoundException {
    exception.expect(FileNotFoundException.class);
    Path filePath = Paths.get("");
    File file = filePath.toFile();
    CsvReader reader = new CsvReader(file);
  }
  
}
