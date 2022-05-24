import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import com.phidget22.*;
public class controler {
	

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws PhidgetException 
	 */
	public static void main(String[] args) throws PhidgetException {
		
		 //Connect to wireless rover
	      Net.addServer("", "192.168.100.1", 5661, "", 0);

	      //Create
	      DCMotor leftMotors = new DCMotor();
	      DCMotor rightMotors = new DCMotor();

	      //Address
	      leftMotors.setHubPort(5);
	      leftMotors.setChannel(0);
	      rightMotors.setHubPort(5);
	      rightMotors.setChannel(1);

	      //Open
	      leftMotors.open(5000);
	      rightMotors.open(5000);

	      //Increase acceleration
	      leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	      rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controler window = new controler();
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
	public controler() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SPIN 360");
		btnNewButton.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(230, 57, 213, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FORWARD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(32, 184, 301, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACKWARDS");
		btnNewButton_2.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(356, 184, 301, 61);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OBSTACLE");
		btnNewButton_3.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_3.setBounds(196, 302, 301, 85);
		frame.getContentPane().add(btnNewButton_3);
		frame.setBounds(100, 100, 711, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
