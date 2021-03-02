package operaciones;

import javax.swing.JButton;

import obj.Jugador;
import obj.Tablero;

public class Operacion {
	public  Tablero t;
	public int i;
	public int j;
	public Jugador p1;
	public Jugador p2;
	
	public Operacion(String nombre1, boolean npc1, boolean pieza1, String nombre2, boolean npc2, boolean pieza2) {
		t = new Tablero();
		this.p1 = new Jugador(nombre1,npc1,pieza1);
		this.p2 = new Jugador(nombre2,  npc2, pieza2);
	}
	

	
	public Operacion() {
		// TODO Auto-generated constructor stub
	}



	public void juega(int k, int l) {

	}

	public void cambiar(JButton btn1_1) {
		btn1_1.setText("X");
		
	}

	public static String getChar() {
	
		return "X";
	}


	public String validaTurno() {
		if(t.isTurno()) {
			return "X";
		}else {
			return "O";
		}
		
	}



	public boolean hayGanador() {
		// TODO Auto-generated method stub
		return false;
	}


	

}
