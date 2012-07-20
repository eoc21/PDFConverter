package uk.co.chemoinformatician.main;

import java.io.IOException;
import java.util.ArrayList;

import uk.co.chemoinformatician.textextraction.DirectoryProcessor;


public class MainWindow {

	public static void main(String[] args) throws IOException {
		ArrayList<String>dataFiles = DirectoryProcessor.processDirectory(args[0]);
		for(int i=0;i<dataFiles.size();i++){
			System.out.println(dataFiles.get(i));
			System.out.println("NEW FILE!");
		}
	}

}
