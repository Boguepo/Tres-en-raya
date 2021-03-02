package visual;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		btn1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_1.setBounds(35, 47, 139, 139);
		contentPane.add(btn1_1);
		
		//Botón en la posición [1][2]
		JButton btn1_2 = new JButton("");
		btn1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_2.setBounds(171, 47, 139, 139);
		contentPane.add(btn1_2);
		
		//Botón en la posición [1][3]
		JButton btn1_3 = new JButton("");
		btn1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_3.setBounds(310, 47, 139, 139);
		contentPane.add(btn1_3);
		
		//Botón en la posición [2][1]
		JButton btn2_1 = new JButton("");
		btn2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_1.setBounds(35, 183, 139, 139);
		contentPane.add(btn2_1);
		
		//Botón en la posición [2][2]
		JButton btn2_2 = new JButton("");
		btn2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_2.setBounds(171, 183, 139, 139);
		contentPane.add(btn2_2);
		
		//Botón en la posición [2][3]
		JButton btn2_3 = new JButton("");
		btn2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_3.setBounds(310, 183, 139, 138);
		contentPane.add(btn2_3);
		
		//Botón en la posición [3][1]
		JButton btn3_1 = new JButton("");
		btn3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_1.setBounds(35, 320, 139, 139);
		contentPane.add(btn3_1);
		
		//Botón en la posición [3][2]
		JButton btn3_2 = new JButton("");
		btn3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_2.setBounds(171, 320, 139, 139);
		contentPane.add(btn3_2);
		
		//Botón en la posición [3][3]
		JButton btn3_3 = new JButton("");
		btn3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_3.setBounds(310, 320, 139, 139);
		contentPane.add(btn3_3);
		
		
		//Botón NUEVA PARTIDA
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBackground(SystemColor.activeCaption);
		btnNuevaPartida.setBounds(674, 34, 118, 23);
		contentPane.add(btnNuevaPartida);
		
		//TextFields
		jugador1 = new JTextField();
		jugador1.setBounds(601, 166, 139, 20);
		contentPane.add(jugador1);
		jugador1.setColumns(10);
		
		jugador2 = new JTextField();
		jugador2.setText("g");
		jugador2.setBounds(601, 338, 139, 20);
		contentPane.add(jugador2);
		jugador2.setColumns(10);
		
		
		//Radio Button 
		JRadioButton rdbtnHumano = new JRadioButton("Humano");
		rdbtnHumano.setBounds(601, 227, 109, 23);
		contentPane.add(rdbtnHumano);
		
		JRadioButton rdbtnCPU = new JRadioButton("CPU");
		rdbtnCPU.setBounds(726, 227, 109, 23);
		contentPane.add(rdbtnCPU);
		
		JRadioButton rdbtnHumano2 = new JRadioButton("Humano");
		rdbtnHumano2.setBounds(601, 387, 109, 23);
		contentPane.add(rdbtnHumano2);
		
		JRadioButton rdbtnCPU2 = new JRadioButton("CPU");
		rdbtnCPU2.setBounds(726, 387, 109, 23);
		contentPane.add(rdbtnCPU2);
		
		//Agrupar los radio button
		ButtonGroup bgroup=new ButtonGroup();
		bgroup.add(rdbtnHumano);
		bgroup.add(rdbtnCPU);
		
		ButtonGroup bgroup2=new ButtonGroup();
		bgroup.add(rdbtnHumano2);
		bgroup.add(rdbtnCPU2);
		
		//LABELS
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setBounds(555, 227, 40, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(553, 169, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(553, 341, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		lblNewLabel_4.setBounds(553, 391, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("JUGADOR 2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(543, 309, 74, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("JUGADOR 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(543, 135, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMensaje.setBounds(543, 76, 197, 29);
		contentPane.add(lblMensaje);
		
	
		
		
	}
}
