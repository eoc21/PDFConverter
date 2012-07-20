package uk.co.chemoinformatician.textextraction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DirectoryProcessor {
	
	public static void processDirectory(String directory) throws IOException{
		File dir = new File(directory);
		BufferedWriter bufferedWriter = null;
		if (dir.isDirectory()){
			for (File child : dir.listFiles()){
				if (".".equals(child.getName()) || "..".equals(child.getName())){
					continue;
				}
				String fileName = child.getAbsolutePath();
				String text = PDF2TextConverter.getExtractedText(fileName);
				String fileNameO = fileName.replace(".pdf", ".txt");
				bufferedWriter = new BufferedWriter(new FileWriter(fileNameO));
				bufferedWriter.write(text);
			}
		}
	}
}
