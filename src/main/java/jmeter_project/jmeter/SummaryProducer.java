package jmeter_project.jmeter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class SummaryProducer {

	private ArrayList<RequestModel> requestArray;
	private ArrayList<SummaryModel> summaryArray = new ArrayList<>();
	private ArrayList<String> labelsArray = new ArrayList<>();

	public SummaryProducer(ArrayList<RequestModel> requestArray) {
		this.requestArray = requestArray;
	}

	public void produceSummaryReport() throws IOException {
		produceSummaryArray();
		produceSummaryCsv();
	}

	private void produceSummaryArray() {
		for (final RequestModel requestModel : requestArray) {
			if (!labelsArray.contains(requestModel.getLabel())) {
				labelsArray.add(requestModel.getLabel());
			}
		}

		for (final String label : labelsArray) {
			SummaryModel summaryLine = new SummaryModel();
			Integer latency = 0;
			Integer count = 0;
			for (RequestModel requestModel : requestArray) {
				if (requestModel.getLabel().equals(label)) {
					latency = latency + requestModel.getLatency();
					count++;
				}
			}
			summaryLine.setLabel(label);
			summaryLine.setCount(count);
			summaryLine.setAverage(latency / count);
			summaryArray.add(summaryLine);
		}
	}

	private void produceSummaryCsv() throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(System.getProperty("user.home" ) + "\\Summary.csv"), ',',
				CSVWriter.NO_QUOTE_CHARACTER);

		String[] headers = { "Summary", "Count", "Average" };
		writer.writeNext(headers);

		for (SummaryModel summaryLine : summaryArray) {
			String[] summaryCsvLine = { summaryLine.getLabel(), summaryLine.getCount().toString(),
					summaryLine.getAverage().toString() };
			writer.writeNext(summaryCsvLine);
		}
		writer.close();
	}
}
