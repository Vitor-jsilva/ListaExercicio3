package lista3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteQuadrado {

	Quadrado quadrado = new Quadrado(5);
	@Test
	public void validaArea() {
		assertTrue(quadrado.area() == 25);
	}
	
	@Test
	public void validaPerimetro() {
		assertTrue(quadrado.perimetro() == 20);
	}
	
	@Test
	public void validaUsaQuadrado() {
		Quadrado q1 = new Quadrado(2);
		assertTrue(q1.area() == 4);
		assertTrue(q1.perimetro() == 8);
		
		Quadrado q2 = new Quadrado(4);
		assertTrue(q2.area() == 16);
		assertTrue(q2.perimetro() == 16);
		
		Quadrado q3 = new Quadrado(5);
		assertTrue(q3.area() == 25);
		assertTrue(q3.perimetro() == 20);
	}
	
}
