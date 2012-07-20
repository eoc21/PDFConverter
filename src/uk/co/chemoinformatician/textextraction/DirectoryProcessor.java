package uk.co.chemoinformatician.textextraction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DirectoryProcessor {
	
	public static ArrayList<String> processDirectory(String directory) throws IOException{
		ArrayList<String> dataFiles = new ArrayList<String>();
		File dir = new File(directory);
		if (dir.isDirectory()){
			for (File child : dir.listFiles()){
				if (".".equals(child.getName()) || "..".equals(child.getName())){
					continue;
				}
				dataFiles.add(PDF2TextConverter.getExtractedText(child.getAbsolutePath()));
			}
		}
		return dataFiles;
	}
}
