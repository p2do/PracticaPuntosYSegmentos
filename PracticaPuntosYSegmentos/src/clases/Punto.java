package clases;

public class Punto {
	
	public int x;
	public int y;
	
	/**
	 * Crea un punto de coordenada x=0 y de coordenada y=0
	 */
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	/**
	 * Crea un punto de coordenadas especificadas por parametros
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public void SetX(int valor) {
		this.x=valor;
	}
	public void SetY(int valor) {
		this.y=valor;
	}
	public int GetX() {
		return this.x;
	}
	public int GetY() {
		return this.y;
	}
	
	/**
	 * Muestra las coordenadas del punto
	 * 
	 * @return las coordenadas del punto en una frase
	 */
	public String toString() {
		String frase="";
		frase=("("+this.x+","+this.y+")");
		return frase;
	}
	}

