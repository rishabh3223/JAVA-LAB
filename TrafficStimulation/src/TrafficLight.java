import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficLight window = new TrafficLight();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrafficLight() {
		
		JFrame frm = new JFrame();
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setTitle("Traffic Light");
		frm.getContentPane().setLayout(null);
		
		JPanel pnl = new JPanel();
		pnl.setSize(300,300);
		
		JRadioButton b1 = new JRadioButton("Red");
		JRadioButton b2 = new JRadioButton("Yellow");
		JRadioButton b3 = new JRadioButton("Green");
		b1.setBounds(100, 40, 30, 30);
		b2.setBounds(125, 40, 30, 30);
		b3.setBounds(150, 40, 30, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		JTextField tf = new JTextField(15);
		tf.setBounds(125, 60, 50, 50);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("STOP");
				tf.setForeground(Color.RED);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("STEADY");
				tf.setForeground(Color.YELLOW);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("GO");
				tf.setForeground(Color.GREEN);
			}
		});
		
		pnl.add(b1);
		pnl.add(b2);
		pnl.add(b3);
		pnl.add(tf);
		
		frm.add(pnl);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
