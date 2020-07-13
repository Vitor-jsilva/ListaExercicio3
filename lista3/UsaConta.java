package lista3;

public class UsaConta {

	public void usaConta() {
		Conta conta = new Conta("nome", 123, "Bradesco", 3500.0, "12 de junho de 2000");
		conta.calculaRendimento();
		conta.imprimirValoresSeValidos();
		conta.saca(200);
		conta.calculaRendimento();
		conta.imprimirValoresSeValidos();
	}
}
