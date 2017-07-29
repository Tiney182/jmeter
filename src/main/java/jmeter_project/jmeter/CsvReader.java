package jmeter_project.jmeter;

import static jmeter_project.jmeter.RequestHeaders.ALL_THREADS;
import static jmeter_project.jmeter.RequestHeaders.BYTES;
import static jmeter_project.jmeter.RequestHeaders.CONNECT;
import static jmeter_project.jmeter.RequestHeaders.DATA_TYPE;
import static jmeter_project.jmeter.RequestHeaders.ELAPSED;
import static jmeter_project.jmeter.RequestHeaders.FAILURE_MESSAGE;
import static jmeter_project.jmeter.RequestHeaders.GRP_THREADS;
import static jmeter_project.jmeter.RequestHeaders.IDLE_TIME;
import static jmeter_project.jmeter.RequestHeaders.LABEL;
import static jmeter_project.jmeter.RequestHeaders.LATENCY;
import static jmeter_project.jmeter.RequestHeaders.RESPONSE_CODE;
import static jmeter_project.jmeter.RequestHeaders.RESPONSE_MESSAGE;
import static jmeter_project.jmeter.RequestHeaders.SENT_BYTES;
import static jmeter_project.jmeter.RequestHeaders.SUCCESS;
import static jmeter_project.jmeter.RequestHeaders.THREAD_NAME;
import static jmeter_project.jmeter.RequestHeaders.TIME_STAMP;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class CsvReader {

	public ArrayList<RequestModel> readCsvToRequestArray(File file) throws IOException {
		CSVReader reader = new CSVReader(new FileReader(file));
		ArrayList<RequestModel> requestArray = new ArrayList<>();
		String[] nextLine;
		if(validateFileHeaders(reader) == true){
			while ((nextLine = reader.readNext()) != null) {
				RequestModel requestModel = new RequestModel();
				requestModel.setTimeStamp(new BigDecimal(nextLine[TIME_STAMP.getCode()]));
				requestModel.setElapsed(Integer.parseInt(nextLine[ELAPSED.getCode()]));
				requestModel.setLabel(nextLine[LABEL.getCode()]);
				requestModel.setResponseCode(nextLine[RESPONSE_CODE.getCode()]);
				requestModel.setResponseMessage(nextLine[RESPONSE_MESSAGE.getCode()]);
				requestModel.setThreadName(nextLine[THREAD_NAME.getCode()]);
				requestModel.setDataType(nextLine[DATA_TYPE.getCode()]);
				requestModel.setSuccess(nextLine[SUCCESS.getCode()]);
				requestModel.setFailureMessage(nextLine[FAILURE_MESSAGE.getCode()]);
				requestModel.setBytes(Integer.parseInt(nextLine[BYTES.getCode()]));
				requestModel.setSentBytes(Integer.parseInt(nextLine[SENT_BYTES.getCode()]));
				requestModel.setGrpThreads(Integer.parseInt(nextLine[GRP_THREADS.getCode()]));
				requestModel.setAllThreads(Integer.parseInt(nextLine[ALL_THREADS.getCode()]));
				requestModel.setLatency(Integer.parseInt(nextLine[LATENCY.getCode()]));
				requestModel.setIdleTime(Integer.parseInt(nextLine[IDLE_TIME.getCode()]));
				requestModel.setConnect(Integer.parseInt(nextLine[CONNECT.getCode()]));
				requestArray.add(requestModel);
			}
			reader.close();
			return requestArray;
		}
		return null;
	}
	
	private boolean validateFileHeaders(CSVReader reader) throws IOException {
		String[] headerLine = reader.readNext();
		if (!headerLine[TIME_STAMP.getCode()].equals("timeStamp")) {
			return false;
		} else if (!headerLine[ELAPSED.getCode()].equals("elapsed")) {
			return false;
		} else if (!headerLine[LABEL.getCode()].equals("label")) {
			return false;
		} else if (!headerLine[RESPONSE_CODE.getCode()].equals("responseCode")) {
			return false;
		} else if (!headerLine[RESPONSE_MESSAGE.getCode()].equals("responseMessage")) {
			return false;
		} else if (!headerLine[THREAD_NAME.getCode()].equals("threadName")) {
			return false;
		} else if (!headerLine[DATA_TYPE.getCode()].equals("dataType")) {
			return false;
		} else if (!headerLine[SUCCESS.getCode()].equals("success")) {
			return false;
		} else if (!headerLine[FAILURE_MESSAGE.getCode()].equals("failureMessage")) {
			return false;
		} else if (!headerLine[BYTES.getCode()].equals("bytes")) {
			return false;
		} else if (!headerLine[SENT_BYTES.getCode()].equals("sentBytes")) {
			return false;
		} else if (!headerLine[GRP_THREADS.getCode()].equals("grpThreads")) {
			return false;
		} else if (!headerLine[ALL_THREADS.getCode()].equals("allThreads")) {
			return false;
		} else if (!headerLine[LATENCY.getCode()].equals("Latency")) {
			return false;
		} else if (!headerLine[IDLE_TIME.getCode()].equals("IdleTime")) {
			return false;
		} else if (!headerLine[CONNECT.getCode()].equals("Connect")) {
			return false;
		}
		return true;
	}
}
