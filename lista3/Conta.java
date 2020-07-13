package lista3;

public class Conta {

	private String nome;
	private int numero;
	private boolean valida = true;
	private String agencia;
	private double saldo;
	private double rendimento;
	private String dataDeAbertura;
	
	public Conta(String nome,int numero,String agencia, double saldo, String data) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = data;
	}

	public void saca(double saque) {
		if(saque<=this.saldo) {
			this.saldo -= saque;
		}else {
			valida = false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double deposito) {
		if(deposito>0) {
			this.saldo +=deposito;
		}else {
			valida = false;
		}
	}
	public double calculaRendimento() {
		rendimento = this.saldo*0.1;
		return rendimento;
	}
	
	public String recuperaDadosParaImpressao() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: "+nome);
		sb.append("\nNumero da Conta: "+numero);
		sb.append("\nAgencia: "+agencia);
		sb.append("\nSaldo: "+saldo);
		sb.append("\nData de Abertura: "+dataDeAbertura);
		sb.append("\nRendimento: "+rendimento);
		return sb.toString();
	}

	public boolean isValida() {return valida;}
	
	public void imprimirValoresSeValidos() {
		if(isValida()) {
			System.out.println(recuperaDadosParaImpressao());
			}else {
				System.err.println("valor invalido");
			}
	}
	
}
