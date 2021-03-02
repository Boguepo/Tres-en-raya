package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
=======
import javax.swing.JButton;

>>>>>>> branch 'dev1' of https://github.com/Boguepo/Tres-en-raya.git

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Visual() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 607);
		
		contentPane = new JPanel();
<<<<<<< HEAD
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
=======
		
		contentPane.setLayout(null);
>>>>>>> branch 'dev1' of https://github.com/Boguepo/Tres-en-raya.git
		setContentPane(contentPane);
<<<<<<< HEAD
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tres en raya");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 11, 103, 23);
		contentPane.add(lblNewLabel);
=======
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(39, 39, 120, 120);
		contentPane.add(btnNewButton);
>>>>>>> branch 'dev1' of https://github.com/Boguepo/Tres-en-raya.git
	}
}
