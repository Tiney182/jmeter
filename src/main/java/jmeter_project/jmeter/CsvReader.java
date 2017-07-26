package jmeter_project.jmeter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class CsvReader {
  
  private File file;
  private CSVReader reader;
  
  public CsvReader(File file) throws FileNotFoundException {
    this.file = file;
    this.reader = initialiseCsvReader(file);
  }

  private CSVReader initialiseCsvReader(File file) throws FileNotFoundException {
    return new CSVReader(new FileReader(file));
  }
  
  public ArrayList<RequestModel> readCsvToRequestArray() throws FileNotFoundException {
    reader = initialiseCsvReader(file);
    ArrayList<RequestModel> requestArray = new ArrayList<>();
    return requestArray;
  }
}
