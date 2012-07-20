package uk.co.chemoinformatician.textextraction;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PDF2TextConverter {

	public static String getExtractedText(String fileName) throws IOException {
		PDDocument doc = null;
		String text;
		try{
			doc = PDDocument.load(fileName);
			PDFTextStripper stripper = new PDFTextStripper();
			text = stripper.getText(doc);
		}
		finally {
			if (doc != null){
				doc.close();				
			}
		}
		return text;
	}
}
