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
		boolean hayGanador = false;
		
		return false;
	}
	/*
	public boolean nextMov(Tablero t,int i, int j, char pieza) {
		if(tablero[i][0]==pieza) return true;
		else return false;
	}*/
	
	
}
