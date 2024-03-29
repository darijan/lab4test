import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnPrzycisk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPrzycisk = new JButton("Przycisk");
		btnPrzycisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrzycisk.setText(textField.getText());
			}
		});
		btnPrzycisk.setBounds(34, 85, 117, 25);
		contentPane.add(btnPrzycisk);
		
		textField = new JTextField();
		textField.setBounds(34, 54, 183, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
