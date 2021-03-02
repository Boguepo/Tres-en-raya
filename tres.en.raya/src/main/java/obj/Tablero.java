package obj;



public class Tablero {
	
	private char[][] tablero;
	private boolean turno;

	public Tablero() {
		this.tablero = new char[3][3];
		this.turno = false;
	}

	/**
	 * @return the tablero
	 */
	public char[][] getTablero() {
		return tablero;
	}

	/**
	 * @param tablero the tablero to set
	 */
	public void setTablero(char move, int i, int j) {
		this.tablero[i][j] = move;
	}

	/**
	 * @return the turno
	 */
	public boolean isTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void switchTurno() {
		this.turno = !this.turno;
	}
	
	
	
	
}