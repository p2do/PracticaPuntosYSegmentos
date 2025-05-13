package clases;

public class Segmento {
	Punto a;
	Punto b;
	
	/**
	 * Crea un Segmento con el punto a = (0,0) y el punto b = (1,1)
	 */
	public Segmento() {
		this.a=new Punto(0,0);
		this.b=new Punto(1,1);
	}
	
	/**
	 * Crea un Segmento con los puntos a y b introducidos por parametros
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) throws IllegalArgumentException {
		if (a==b) {
			throw new IllegalArgumentException("No puede ser los dos punto iguales");
		}else {
			this.a=a;
			this.b=b;
		}
	}
	
	public void SetA(Punto valor) {
		this.a=valor;
	}
	
	public void SetB(Punto valor) {
		this.b=valor;
	}
	
	public Punto GetA() {
		return this.a;
	}
	
	public Punto GetB() {
		return this.b;
	}
	
	public String toString() {
		String frase="";
		frase="[("+this.a+")],"+"("+this.b+")]";
		return frase;
	}
	
	/**
	 * Calcula la distancia entre los dos puntos del Segmento
	 * 
	 * @return la distancia entre punto y punto
	 */
	public double distancia() {
		double formula=Math.sqrt(Math.pow(this.b.x-this.a.x,2)+ Math.pow(this.b.y-this.a.y,2));
		return formula;
	}
}
