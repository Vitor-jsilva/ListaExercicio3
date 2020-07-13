package lista3;

public class UsaEstoque {

	public void main() {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
		Estoque estoque3 = new Estoque("Mouse Ótico",6,2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		
		estoque1.valida();
		estoque2.valida();
		estoque3.valida();
		
		if(estoque1.valida().equals("valido") && estoque2.valida().equals("valido")&&estoque3.valida().equals("valido")) {
		System.out.println(estoque1.precisaRepor());
		System.out.println(estoque2.precisaRepor());
		System.out.println(estoque3.precisaRepor());
		
		System.out.printf(estoque1.mostra());
		System.out.printf(estoque2.mostra());
		System.out.printf(estoque3.mostra());
		}else {
			System.err.print("valor invalido quantidade minima ou atual não podem ser negativas");
		}
	}
	
}
