package jmeter_project.jmeter;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChooser {

	public File createFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		int fileChooserReturnValue = fileChooser.showOpenDialog(fileChooser);

		if(fileChooserReturnValue == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else {
			return null;
		}
	}
}
