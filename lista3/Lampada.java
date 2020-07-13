package lista3;


public class Lampada {

	private boolean ligada;

	public void main() {
		Lampada lamp1 = new Lampada();
		Lampada lamp2 = new Lampada();
		
		lamp1.liga();
		System.out.println(lamp1.observa());
		lamp2.desliga();
		System.out.println(lamp2.observa());
	}
	
	public void liga() {
		this.ligada = true;
	}
	public void desliga() {
		this.ligada = false;
	}
	
	public boolean getLampada() {
		return ligada;
	}
	
	public String observa() {
		if(ligada) 
			return "ligada";
		return "desligada";
	}
	
}
