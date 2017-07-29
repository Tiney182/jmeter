package jmeter_project.jmeter;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	public File createFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Select logging file", "log");
		fileChooser.setFileFilter(filter);

		int fileChooserReturnValue = fileChooser.showOpenDialog(fileChooser);
		if(fileChooserReturnValue == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else {
			return null;
		}
	}
}
