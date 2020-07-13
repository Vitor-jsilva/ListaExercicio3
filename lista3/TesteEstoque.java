package lista3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteEstoque {

	Estoque estoqueSemParametro = new Estoque();
	Estoque estoqueComParametro = new Estoque("nome",2,4);
	
	@Test
	public void validaQuantidade() {
		Estoque estoqueQuantidadeNegativa = new Estoque("nome",-2,-4);
		assertTrue(estoqueQuantidadeNegativa.valida().equals("Quantidade não pode ser negativa"));
	}
	
	@Test
	public void validaMudarNome() {
		estoqueComParametro.mudarNome("novoNome");
		assertTrue(estoqueComParametro.getNome() == "novoNome");
		
	}
	
	@Test
	public void validaRepor() {
		estoqueComParametro.repor(3);
		assertTrue(estoqueComParametro.getQntdAtual() == 5);
	}
	
	@Test
	public void validaDarBaixa() {
		estoqueComParametro.darBaixa(1);
		assertTrue(estoqueComParametro.getQntdAtual() == 1);
	}
	
	@Test
	public void validaPrecisaReporTrue() {
		Estoque estoquePrecisa = new Estoque("nome",3,5);
		assertTrue(estoquePrecisa.precisaRepor());
	}
	@Test
	public void validaPrecisaReporFalse() {
		Estoque estoque = new Estoque("nome",7,5);
		assertFalse(estoque.precisaRepor());
	}

}
