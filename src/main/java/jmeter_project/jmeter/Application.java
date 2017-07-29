package jmeter_project.jmeter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
	public static void main(String[] args) throws IOException {
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.createFileChooser();
		if (file != null) {
			CsvReader reader = new CsvReader();
			ArrayList<RequestModel> requestModelArray;
			requestModelArray = reader.readCsvToRequestArray(file);

			SummaryProducer sp = new SummaryProducer(requestModelArray);
			sp.produceSummaryReport();
		}
	}
}
