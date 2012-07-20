package uk.co.chemoinformatician.main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import uk.co.chemoinformatician.textextraction.DirectoryProcessor;

public class FileSelector extends JPanel
implements ActionListener {
	JButton go;

	JFileChooser chooser;
	String choosertitle;
    private String directoryName;
    
	public FileSelector() {
		go = new JButton("Go to directory");
		go.addActionListener(this);
		add(go);
	}

	public void actionPerformed(ActionEvent e) {
		int result;

		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			/*System.out.println("getCurrentDirectory(): "
					+  chooser.getCurrentDirectory());
			System.out.println("getSelectedFile() : "
					+  chooser.getSelectedFile());*/
			directoryName = chooser.getSelectedFile().getAbsolutePath();
			try {
				DirectoryProcessor.processDirectory(directoryName);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			System.out.println("No Selection ");
		}
	}

	public Dimension getPreferredSize(){
		return new Dimension(400, 400);
	}
	
	public String getSelectedDirectory(){
		return directoryName;
	}
}
