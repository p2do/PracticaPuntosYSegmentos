package app;

import clases.Punto;
import clases.Segmento;

public class Principal {

	public static void main(String[] args) {
		
	Punto p1=new Punto(aleatorio(),aleatorio());
	Punto p2=new Punto(aleatorio(),aleatorio());
	Punto p3=new Punto(aleatorio(),aleatorio());
	Punto p4=new Punto(aleatorio(),aleatorio());
	
	Segmento s1= new Segmento(p1,p2);
	Segmento s2=new Segmento(p3,p4);
	
	}
	
	public static int aleatorio() {
		int aleatorio=0+(int)(Math.random()*(10-0+1));
		return aleatorio;
	}

}
