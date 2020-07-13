package lista3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteConta {

	Conta conta = new Conta("nome", 123, "Bradesco", 3500.0, "12 de junho");
	
	@Test
	public void validaSaque() {
		conta.saca(100.0);
		assertTrue(conta.getSaldo() == 3400.0);
	}
	@Test
	public void validaSaqueInvalido() {
		conta.saca(3600.0);
		assertFalse(conta.getSaldo() == -100.0);
	}
	
	@Test
	public void validaDeposito() {
		conta.deposita(200.0);
		assertTrue(conta.getSaldo() == 3700.0);
	}
	
	@Test
	public void validaRendimento() {
		double rendimento = conta.calculaRendimento();
		assertTrue(rendimento == 350);
	}
}
