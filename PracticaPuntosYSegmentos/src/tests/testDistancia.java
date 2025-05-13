package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Punto;
import clases.Segmento;

class testDistancia {

	
	Punto p1= new Punto(1,4);
	Punto p2= new Punto(4,2);
	
	Segmento s1= new Segmento(p1,p2);
	
	Punto p3= new Punto(-2,-6);
	Punto p4= new Punto(-7,-1);
	
	Segmento s2= new Segmento(p3,p4);
	
	Segmento s3= new Segmento(p1,p4);
	
	Segmento s4= new Segmento(p1,p1);

	@Test
	void testDistancia1() {
	
	double distanciaObtenida= (s1.distancia()*100)/100;
	double distanciaEsperada=(3.605551275463989*100)/100;
	
	assertEquals(distanciaEsperada, distanciaObtenida);
		
	}
	
	@Test
	void testDistancia2() {
	
	double distanciaObtenida= (s2.distancia()*100)/100;
	double distanciaEsperada=(7.071067811865475*100)/100;
	
	assertEquals(distanciaEsperada, distanciaObtenida);
		
	}
	
	@Test
	void testDistancia3() {
	
	double distanciaObtenida= (s3.distancia()*100)/100;
	double distanciaEsperada=(9.433981132056604*100)/100;
	
	assertEquals(distanciaEsperada, distanciaObtenida);
		
	}
	
	@Test
	void testException() {
	
	Exception e = assertThrows(IllegalArgumentException.class,
					() -> new Segmento(p1,p1)
				);
	
	String mensajeEsperado="No puede ser los dos punto iguales";
	String mensajeObtenido= e.getMessage();
	
	assertEquals(mensajeEsperado, mensajeObtenido);
		
	}

	
	
	

}
