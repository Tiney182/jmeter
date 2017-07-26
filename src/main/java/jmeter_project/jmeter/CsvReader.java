package jmeter_project.jmeter;

import static jmeter_project.jmeter.Headers.ALLTHREADS;
import static jmeter_project.jmeter.Headers.BYTES;
import static jmeter_project.jmeter.Headers.CONNECT;
import static jmeter_project.jmeter.Headers.DATATYPE;
import static jmeter_project.jmeter.Headers.ELAPSED;
import static jmeter_project.jmeter.Headers.FAILUREMESSAGE;
import static jmeter_project.jmeter.Headers.GRP_THREADS;
import static jmeter_project.jmeter.Headers.IDLETIME;
import static jmeter_project.jmeter.Headers.LABEL;
import static jmeter_project.jmeter.Headers.LATENCY;
import static jmeter_project.jmeter.Headers.RESPONSECODE;
import static jmeter_project.jmeter.Headers.RESPONSEMESSAGE;
import static jmeter_project.jmeter.Headers.SENT_BYTES;
import static jmeter_project.jmeter.Headers.SUCCESS;
import static jmeter_project.jmeter.Headers.THREADNAME;
import static jmeter_project.jmeter.Headers.TIMESTAMP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

  public ArrayList<RequestModel> readCsvToRequestArray() throws IOException {
    reader = initialiseCsvReader(file);
    ArrayList<RequestModel> requestArray = new ArrayList<>();
    String [] nextLine;
    RequestModel requestModel = new RequestModel();
    while((nextLine = reader.readNext()) != null)  {
      requestModel.setTimeStamp(Integer.parseInt(nextLine[TIMESTAMP.getCode()]));
      requestModel.setElapsed(Integer.parseInt(nextLine[ELAPSED.getCode()]));
      requestModel.setLabel(nextLine[LABEL.getCode()]);
      requestModel.setResponseCode(Integer.parseInt(nextLine[RESPONSECODE.getCode()]));
      requestModel.setResponseMessage(nextLine[RESPONSEMESSAGE.getCode()]);
      requestModel.setThreadName(nextLine[THREADNAME.getCode()]);
      requestModel.setDataType(nextLine[DATATYPE.getCode()]);
      requestModel.setSuccess(nextLine[SUCCESS.getCode()]);
      requestModel.setFailureMessage(nextLine[FAILUREMESSAGE.getCode()]);
      requestModel.setBytes(Integer.parseInt(nextLine[BYTES.getCode()]));
      requestModel.setSentBytes(Integer.parseInt(nextLine[SENT_BYTES.getCode()]));
      requestModel.setGrpThreads(Integer.parseInt(nextLine[GRP_THREADS.getCode()]));
      requestModel.setAllThreads(Integer.parseInt(nextLine[ALLTHREADS.getCode()]));
      requestModel.setLatency(Integer.parseInt(nextLine[LATENCY.getCode()]));
      requestModel.setIdleTime(Integer.parseInt(nextLine[IDLETIME.getCode()]));
      requestModel.setConnect(Integer.parseInt(nextLine[CONNECT.getCode()]));
    }
    return requestArray;
  }
}
