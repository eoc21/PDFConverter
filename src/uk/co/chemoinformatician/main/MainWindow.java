package uk.co.chemoinformatician.main;

import java.io.IOException;

import uk.co.chemoinformatician.textextraction.DirectoryProcessor;


public class MainWindow {

	public static void main(String[] args) throws IOException {
		DirectoryProcessor.processDirectory(args[0]);
	}

}
