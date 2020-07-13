package lista3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteLampada {

	Lampada lampada = new Lampada();
	
	@Test
	public void validaMetodoLiga() {
		lampada.liga();
		assertTrue(lampada.getLampada());
	}
	@Test
	public void validaMetodoDesliga() {
		lampada.desliga();
		assertFalse(lampada.getLampada());
	}
	@Test
	public void validaObservaLigada() {
		lampada.liga();
		assertTrue(lampada.observa().equals("ligada"));
	}
	@Test
	public void validaObservaDesligada() {
		lampada.desliga();
		assertTrue(lampada.observa().equals("desligada"));
	}
	@Test
	public void validaMain() {
		Lampada lamp1 = new Lampada();
		Lampada lamp2 = new Lampada();
		lamp1.liga();
		assertTrue(lamp1.observa().equals("ligada"));
		lamp2.desliga();
		assertTrue(lamp2.observa().equals("desligada"));
	}
	
}
