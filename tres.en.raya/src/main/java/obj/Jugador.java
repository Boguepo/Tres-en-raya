package obj;

public class Jugador {
	
	private String nombre;
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

	
	
	
	
}
