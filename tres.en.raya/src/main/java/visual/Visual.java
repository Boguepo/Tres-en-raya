package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

import obj.Tablero;


import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contador = 0;
	private JPanel contentPane;
	private JTextField jugador1;
	private JTextField jugador2;
	private Tablero tablero;
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

		// TextFields
		jugador1 = new JTextField();
		jugador1.setBounds(601, 166, 139, 20);
		contentPane.add(jugador1);
		jugador1.setColumns(10);

		jugador2 = new JTextField();
		jugador2.setBounds(601, 338, 139, 20);
		contentPane.add(jugador2);
		jugador2.setColumns(10);

		// Radio Button
		JRadioButton rdbtnHumano = new JRadioButton("Humano");
		rdbtnHumano.setBounds(601, 227, 109, 23);
		rdbtnHumano.setSelected(true);
		contentPane.add(rdbtnHumano);

		JRadioButton rdbtnCPU = new JRadioButton("CPU");
		rdbtnCPU.setBounds(726, 227, 109, 23);
		contentPane.add(rdbtnCPU);

		JRadioButton rdbtnHumano2 = new JRadioButton("Humano");
		rdbtnHumano2.setBounds(601, 387, 109, 23);
		rdbtnHumano2.setSelected(true);
		contentPane.add(rdbtnHumano2);

		JRadioButton rdbtnCPU2 = new JRadioButton("CPU");
		rdbtnCPU2.setBounds(726, 387, 109, 23);
		contentPane.add(rdbtnCPU2);

		// Agrupar los radio button
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnHumano);
		bgroup.add(rdbtnCPU);
		
		ButtonGroup bgroup2 = new ButtonGroup();
		bgroup2.add(rdbtnHumano2);
		bgroup2.add(rdbtnCPU2);

		// LABELS
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

		
		JButton btn1_1 = new JButton("");
		JButton btn1_2 = new JButton("");
		JButton btn1_3 = new JButton("");
		JButton btn2_1 = new JButton("");
		JButton btn2_2 = new JButton("");
		JButton btn2_3 = new JButton("");
		JButton btn3_1 = new JButton("");
		JButton btn3_2 = new JButton("");
		JButton btn3_3 = new JButton("");
		JButton[] btnArray = {btn1_1,btn1_2,btn1_3,btn2_1,btn2_2,btn2_3,btn3_1,btn3_2,btn3_3};
		
		// Botón en la posición [1][1]
		btn1_1.setEnabled(false);
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn1_1, lblMensaje, btnArray, 0, 0);
				
			}
		});
		btn1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_1.setBounds(35, 47, 139, 139);
		contentPane.add(btn1_1);

		// Botón en la posición [1][2]
		
		btn1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn1_2, lblMensaje, btnArray, 0, 1);
			}
		});
		btn1_2.setEnabled(false);
		btn1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_2.setBounds(171, 47, 139, 139);
		contentPane.add(btn1_2);

		// Botón en la posición [1][3]
		btn1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn1_3, lblMensaje, btnArray, 0, 2);
			}
		});
		btn1_3.setEnabled(false);
		btn1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn1_3.setBounds(310, 47, 139, 139);
		contentPane.add(btn1_3);

		// Botón en la posición [2][1]
		btn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn2_1, lblMensaje, btnArray, 1, 0);
			}
		});
		btn2_1.setEnabled(false);
		btn2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_1.setBounds(35, 183, 139, 139);
		contentPane.add(btn2_1);

		// Botón en la posición [2][2]
		btn2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn2_2, lblMensaje, btnArray, 1,1);
			}
		});
		btn2_2.setEnabled(false);
		btn2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_2.setBounds(171, 183, 139, 139);
		contentPane.add(btn2_2);

		// Botón en la posición [2][3]
		btn2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn2_3, lblMensaje, btnArray, 1, 2);
			}
		});
		btn2_3.setEnabled(false);
		btn2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn2_3.setBounds(310, 183, 139, 138);
		contentPane.add(btn2_3);

		// Botón en la posición [3][1]
		btn3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn3_1, lblMensaje, btnArray, 2, 0);
			}
		});
		btn3_1.setEnabled(false);
		btn3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_1.setBounds(35, 320, 139, 139);
		contentPane.add(btn3_1);

		// Botón en la posición [3][2]
		btn3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn3_2, lblMensaje, btnArray, 2,1);
			}
		});
		btn3_2.setEnabled(false);
		btn3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_2.setBounds(171, 320, 139, 139);
		contentPane.add(btn3_2);

		// Botón en la posición [3][3]
		btn3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarJugada(btn3_3, lblMensaje, btnArray, 2 , 2);
			}
		});
		btn3_3.setEnabled(false);
		btn3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		btn3_3.setBounds(310, 320, 139, 139);
		contentPane.add(btn3_3);
		

		// Botón NUEVA PARTIDA
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean npc1 = true;
				boolean npc2 = true;
				
				if(rdbtnHumano.isSelected()) {
					npc1 = false;
				}else if(rdbtnCPU.isSelected()) {
					npc1 = true;
				}
				
				if(rdbtnHumano2.isSelected()) {
					npc2 = false;
				}else if(rdbtnCPU2.isSelected()) {
					npc2 = true;
				}
				tablero = new Tablero(jugador1.getText(),npc1,false,jugador2.getText(),npc2,true);
				contador = 0;
				resetGame(btnArray, lblMensaje);
				
			}

			
		});
		btnNuevaPartida.setBackground(SystemColor.activeCaption);
		btnNuevaPartida.setBounds(674, 34, 118, 23);
		contentPane.add(btnNuevaPartida);

	}
	
	protected void validarJugada(JButton btn, JLabel lblMensaje, JButton[] btnArray, int i, int j) {
		String aux = new String();
		aux = tablero.validaTurno();
		if(aux.equals("O")) {
			btn.setText("O");
		}else {
			btn.setText("X");
		}
		if(tablero.hayGanador()) {
			if(tablero.isTurno()) {
				lblMensaje.setText("El ganador es: "+jugador2.getText());
			}else {
				lblMensaje.setText("El ganador es: "+jugador1.getText());
			}
			setBtnOff(btnArray);
		}
		if(contador == 9) {
			lblMensaje.setText("Empate");
			
		}
		tablero.switchTurno();
		if(tablero.isTurno()) {
			tablero.setTablero('X', i, j);
			lblMensaje.setText(jugador2.getText()+", te toca mover");
		}else {
			tablero.setTablero('O', i, j);
			lblMensaje.setText(jugador1.getText()+", te toca mover");
		}
		
		btn.setEnabled(false);
		contador++;
		
	}

	private void setBtnOff(JButton[] btnArray) {
		for (int i = 0; i < btnArray.length; i++) {
			btnArray[i].setEnabled(false);
		}
		
	}
	
	private void resetGame(JButton[] btnArray, JLabel msg) {
		for (int i = 0; i < btnArray.length; i++) {
			btnArray[i].setEnabled(true);
			btnArray[i].setText("");
			msg.setText("");
		}
		
	}
	
	
}