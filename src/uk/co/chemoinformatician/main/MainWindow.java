package uk.co.chemoinformatician.main;

import java.io.IOException;

import uk.co.chemoinformatician.textextraction.PDF2TextConverter;

public class MainWindow {

	public static void main(String[] args) throws IOException {
		String extractedText = PDF2TextConverter.getExtractedText(args[0]);
		System.out.println(extractedText);
	}

}
