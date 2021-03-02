package obj;

public class Jugador {
	
	private String nombre;
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

	
	
	

}
