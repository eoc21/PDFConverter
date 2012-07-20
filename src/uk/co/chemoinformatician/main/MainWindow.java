package uk.co.chemoinformatician.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

public class MainWindow {
	
	public static void main(String[] args) throws IOException {
		  JFrame frame = new JFrame("PDF2TextConverter");
		    FileSelector panel = new FileSelector();
		    frame.addWindowListener(
		      new WindowAdapter() {
		        public void windowClosing(WindowEvent e) {
		          System.exit(0);
		          }
		        }
		      );
		    frame.getContentPane().add(panel,"Center");
		    frame.setSize(panel.getPreferredSize());
		    frame.pack();
		    frame.setVisible(true);
	}

}
