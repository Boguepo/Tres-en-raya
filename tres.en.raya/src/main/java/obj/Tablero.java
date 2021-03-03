package obj;



public class Tablero {
	
	private char[][] tablero;
	private boolean turno;
	private Jugador p1;
	private Jugador p2;

	public Tablero(String nombre1, boolean npc1, boolean pieza1, String nombre2, boolean npc2, boolean pieza2) {
		this.tablero = new char[3][3];
		this.turno = false;
		this.p1 = new Jugador(nombre1,npc1,pieza1);
		this.p2 = new Jugador(nombre2,  npc2, pieza2);
	}
	
	/**
	 * @return the p1
	 */
	public Jugador getP1() {
		return p1;
	}

	/**
	 * @return the p2
	 */
	public Jugador getP2() {
		return p2;
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

	public void switchTurno() {
		this.turno = !this.turno;
	}
	
	public String validaTurno() {
		if(isTurno()) {
			return "X";
		}else {
			return "O";
		}
		
	}

	
	public boolean hayGanador() {
		
		boolean colum = comprobarColum();
		boolean fila = comprobarFila();
		boolean diag = comprobarDiag();
		
		if(colum || fila || diag) {
			return true;
		}else {
			return false;
		}
	}
	/*
	public boolean nextMov(Tablero t,int i, int j, char pieza) {
		if(tablero[i][0]==pieza) return true;
		else return false;
	}*/

	private boolean comprobarDiag() {
		if(tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] != 0) {
			return true;
			
		}else if(tablero[2][0] == tablero[1][1] && tablero[2][0] == tablero[0][2] && tablero[2][0] != 0) {
			return true;
		}else {
				return false;
		}
	}

	private boolean comprobarColum() {
		if(tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0] && tablero[0][0] != 0) {
			return true;
			
		}else if(tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[1][2] && tablero[0][1] != 0) {
			return true;
		}else if(tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2] && tablero[0][2] != 0) {
			return true;
		}else {
				return false;
		}
		
	}

	private boolean comprobarFila() {
		if(tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && tablero[0][0] != 0) {
			return true;
			
		}else if(tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] != 0) {
			return true;
		}else if(tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] != 0) {
			return true;
		}else {
				return false;
		}
	
	}
	
	
}
