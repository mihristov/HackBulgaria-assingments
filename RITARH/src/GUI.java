import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.apfloat.*;



public class GUI {

	private JFrame frmE;
	private JTextField fPrecision;
	private JTextField fThreads;
	private JTextField fTime;
	private TextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmE.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmE = new JFrame();
		frmE.setTitle("e");
		frmE.setBounds(100, 100, 450, 329);
		frmE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmE.getContentPane().setLayout(null);
		
		JLabel lblPrecision = new JLabel("Precision: ");
		lblPrecision.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPrecision.setBounds(10, 11, 67, 28);
		frmE.getContentPane().add(lblPrecision);
		
		fPrecision = new JTextField();
		fPrecision.setBounds(87, 15, 99, 20);
		frmE.getContentPane().add(fPrecision);
		fPrecision.setColumns(10);
		
		JLabel lblThreads = new JLabel("Threads:");
		lblThreads.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblThreads.setBounds(10, 50, 67, 14);
		frmE.getContentPane().add(lblThreads);
		
		fThreads = new JTextField();
		fThreads.setColumns(10);
		fThreads.setBounds(87, 46, 99, 20);
		frmE.getContentPane().add(fThreads);
		
		JButton button = new JButton("Calculate!");
		button.setBounds(323, 14, 99, 23);
		frmE.getContentPane().add(button);
		
		JLabel lblTime = new JLabel("Execution time:");
		lblTime.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTime.setBounds(211, 50, 100, 14);
		frmE.getContentPane().add(lblTime);
		
		fTime = new JTextField();
		fTime.setEditable(false);
		fTime.setColumns(10);
		fTime.setBounds(323, 47, 99, 20);
		frmE.getContentPane().add(fTime);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblResult.setBounds(10, 85, 100, 14);
		frmE.getContentPane().add(lblResult);
		
		textArea = new TextArea("0",4,4, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setBounds(20, 110, 402, 157);
		frmE.getContentPane().add(textArea);


	
	    button.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent evt)
	        {
	        	textArea.setText("Calculating...");
	            goButtonActionPerformed(evt);
	        }
	    });
	}
	
    private void goButtonActionPerformed(ActionEvent evt)
    {	
        Integer threadCount;
        threadCount = Integer.parseInt(fThreads.getText());
        
        Integer flag = 1;
        Integer precision = Integer.parseInt(fPrecision.getText());
        
        Results res = Runner.myRunner(precision, threadCount, flag);
        textArea.setText(res.result.toString(true));
        fTime.setText("" + res.time);
        
    }	
}