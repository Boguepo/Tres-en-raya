package obj;

public class Jugador {
	
	private String nombre;
<<<<<<< HEAD
	private boolean es_npc;
	private char pieza;
	

	public Jugador(String nombre,boolean es_npc,char pieza) {
		this.nombre=nombre;
		this.es_npc=es_npc;
		this.pieza=pieza;
	}
	
	private void validarTurno(boolean t) {
		if(t) {
			this.pieza='X';
		}else {
			this.pieza='O';
		}
	}

	public String getNombre() {
		return nombre;
	}

	
	public boolean isEs_npc() {
		return es_npc;
	}

	
	public char getPieza() {
		return pieza;
	}

	
	
	
	
=======
	private boolean npc;
	private char pieza;
	
	public Jugador(String nombre, boolean npc, boolean turno) {
		this.nombre = nombre;
		this.npc = npc;
		validarTurno(turno);
		
	}

	private void validarTurno(boolean t) {
		if(t) {
			this.pieza = 'X';
		}else {
			this.pieza = 'O';
		}
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the es_npc
	 */
	public boolean isNpc() {
		return npc;
	}

	

	/**
	 * @return the pieza
	 */
	public char getPieza() {
		return pieza;
	}
	
	public void jugar(Tablero t, int i,int j) {
		t.setTablero(pieza, i, j);
		t.switchTurno();
	}
	
	public void jugar(Tablero t) {
		
	}
	
	
	

>>>>>>> refs/remotes/origin/dev1
}
