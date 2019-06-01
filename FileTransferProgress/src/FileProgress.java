package CopyProgress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class FileProgress extends JFrame implements Runnable,ActionListener {
	private static final long serialVersionUID = 1L;
	
	JPanel pnl;
	JProgressBar jpb;
	JLabel fromFile, toFile;
	JTextField fromName,toName;
	JButton copyButton,stopButton;
	BufferedInputStream inBuffer;
	BufferedOutputStream outBuffer;
	
	public FileProgress(String title){
		super(title);
		
		pnl = new JPanel();
		pnl.setLayout(new FlowLayout());
		pnl.setSize(300,300);
		add(pnl);
		
		jpb = new JProgressBar(0,100);
		jpb.setStringPainted(true);
		jpb.setVisible(true);
		
		fromFile = new JLabel("Source File");
		fromName = new JTextField(20);
		toFile = new JLabel("Destination File");
		toName = new JTextField(20);
		
		copyButton = new JButton("Copy");
		stopButton = new JButton("Stop");
		
		copyButton.addActionListener(this);
		stopButton.addActionListener(this);
		
		pnl.add(fromFile);pnl.add(fromName);
		pnl.add(toFile);pnl.add(toName);
		pnl.add(jpb);
		pnl.add(copyButton);pnl.add(stopButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == copyButton) {
			run();
		}
		else if(e.getSource() == stopButton) {
			try {
				if(inBuffer != null)
					inBuffer.close();
				else if(outBuffer != null)
					outBuffer.close();
				inBuffer = new BufferedInputStream(new FileInputStream(toName.getText()));
				Scanner content = new Scanner(inBuffer);
				while(content.hasNextLine()) {
					System.out.println(content.nextLine());
				}
				content.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String inFile = fromName.getText();
		String outFile = toName.getText();
		
		File in = new File(inFile);
		File out = new File(outFile);
		byte []input = new byte[30];
		int total=0,tcount=0,rcount=0;
		try {
			out.createNewFile();
			BufferedInputStream inBuffer = new BufferedInputStream(new FileInputStream(in));
			BufferedOutputStream outBuffer = new BufferedOutputStream(new FileOutputStream(out));
			total=inBuffer.available();
			
			while((rcount=inBuffer.read(input))!=-1) {
				outBuffer.write(input);
				tcount+=rcount;
				jpb.setValue((int)(tcount*100)/total);
			}
			inBuffer.close();
			outBuffer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		FileProgress fp = new FileProgress("Copy Progress");
		fp.setVisible(true);
		fp.setSize(300,300);
	}

}
