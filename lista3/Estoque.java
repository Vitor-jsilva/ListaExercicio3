package lista3;

public class Estoque {

	private String nome;
	private int qntdAtual;
	private int qntdMinima;
	public Estoque() {
		
	}
	
	public Estoque(String nome,int qntdAtual,int qntdMinima) {
			this.nome = nome;
			this.qntdAtual = qntdAtual;
			this.qntdMinima = qntdMinima;
	}
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public String valida() {
		if(this.qntdAtual <0 ||this.qntdMinima<0) {
			return "Quantidade não pode ser negativa";
		}else
			return "valido";
	}
	
	public void darBaixa(int baixa) {
		this.qntdAtual -= baixa;
	}
	
	public void repor(int reposicao) {
		this.qntdAtual += reposicao;
	}
	
	public void mudarQntdMinima(int novaQntdMinima) {
		if(novaQntdMinima>=0) {
		this.qntdMinima = novaQntdMinima;
		}
	}
	
	public boolean precisaRepor() {
		if(this.qntdAtual<=qntdMinima) {
			return true;
		}else {
			return false;
		}
	}
	
	public String mostra() {
		return "\nnome: "+this.nome+"\nqntdAtual:"+this.qntdAtual+"\nqntdMinima:"+this.qntdMinima+"\n";
	}
	
	//getters
	
	public String getNome() {return nome;}
	
	public int getQntdAtual() {return qntdAtual;}
	
	public int getQntdMinima() {return qntdMinima;}

	
}
