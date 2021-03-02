package obj;

import javax.swing.JButton;

public class Tablero {
	
	private char[][] tablero;
	private boolean turno;
	
	
	public Tablero() {
		this.tablero=new char[3][3];
		this.turno=false; //esto equivale a la pieza 'X'
	}

	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char move,int i, int j) {
		this.tablero[i][j] = move;
	}
	
	public void switchTurno() {
		this.turno=!this.turno;
	}
}
