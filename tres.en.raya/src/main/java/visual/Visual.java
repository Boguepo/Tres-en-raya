package visual;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField jugador1;
	private JTextField jugador2;

	/**
	 * Create the frame.
	 */
	public Visual() {
		setVisible(true);
		setTitle("TRES EN RAYA");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 607);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//Botón en la posición [1][1]
		JButton btn1_1 = new JButton("");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1_1.setBounds(35, 47, 139, 139);
		contentPane.add(btn1_1);
		
		//Botón en la posición [1][2]
		JButton btn1_2 = new JButton("");
		btn1_2.setBounds(171, 47, 139, 139);
		contentPane.add(btn1_2);
		
		//Botón en la posición [1][3]
		JButton btn1_3 = new JButton("");
		btn1_3.setBounds(310, 47, 139, 139);
		contentPane.add(btn1_3);
		
		//Botón en la posición [2][1]
		JButton btn2_1 = new JButton("");
		btn2_1.setBounds(35, 183, 139, 139);
		contentPane.add(btn2_1);
		
		//Botón en la posición [2][2]
		JButton btn2_2 = new JButton("");
		btn2_2.setBounds(171, 183, 139, 139);
		contentPane.add(btn2_2);
		
		//Botón en la posición [2][3]
		JButton btn2_3 = new JButton("");
		btn2_3.setBounds(310, 183, 139, 138);
		contentPane.add(btn2_3);
		
		//Botón en la posición [3][1]
		JButton btn3_1 = new JButton("");
		btn3_1.setBounds(35, 320, 139, 139);
		contentPane.add(btn3_1);
		
		//Botón en la posición [3][2]
		JButton btn3_2 = new JButton("");
		btn3_2.setBounds(171, 320, 139, 139);
		contentPane.add(btn3_2);
		
		//Botón en la posición [3][3]
		JButton btn3_3 = new JButton("");
		btn3_3.setBounds(310, 320, 139, 139);
		contentPane.add(btn3_3);
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBounds(689, 66, 89, 23);
		contentPane.add(btnNuevaPartida);
		
		jugador1 = new JTextField();
		jugador1.setBounds(601, 166, 86, 20);
		contentPane.add(jugador1);
		jugador1.setColumns(10);
		
		jugador2 = new JTextField();
		jugador2.setBounds(601, 364, 86, 20);
		contentPane.add(jugador2);
		jugador2.setColumns(10);
		
		JRadioButton rdbtnHumano2 = new JRadioButton("Humano");
		rdbtnHumano2.setBounds(543, 436, 109, 23);
		contentPane.add(rdbtnHumano2);
		
		JRadioButton rdbtnCPU2 = new JRadioButton("CPU");
		rdbtnCPU2.setBounds(689, 436, 109, 23);
		contentPane.add(rdbtnCPU2);
		
		JRadioButton rdbtnHumano = new JRadioButton("Humano");
		rdbtnHumano.setBounds(543, 281, 109, 23);
		contentPane.add(rdbtnHumano);
		
		JRadioButton rdbtnCPU = new JRadioButton("CPU");
		rdbtnCPU.setBounds(689, 281, 109, 23);
		contentPane.add(rdbtnCPU);
		
		
		
		
	}
}
