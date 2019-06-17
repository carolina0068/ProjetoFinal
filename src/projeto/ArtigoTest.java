package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void testGetDesconto() {
		Artigo a1 = new Artigo();
		a1.setDesconto(0.20);
		
		assertTrue(a1.getDesconto() == 0.20);
	}

	@Test
	void testSetDesconto() {
		Artigo a1 = new Artigo();
		a1.setDesconto(0.30);
		
		assertTrue(a1.getDesconto() == 0.30);
	}
	
	@Test
	void testGetDescricao() {
		Artigo a1 = new Artigo();
		a1.setDescricao("ola");
		
		assertTrue(a1.getDescricao() == "ola");
	}
	
	void testSetDescricao() {
		Artigo a1 = new Artigo();
		a1.setDescricao("ola");
		
		assertTrue(a1.getDescricao() == "ola");
	}

	@Test
	void testGetCodigo_Artigo() {
		Artigo a1 = new Artigo();
		a1.setCodigo_Artigo(1234);
		
		assertTrue(a1.getCodigo_Artigo() == 1234);
	}

	@Test
	void testSetCodigo_Artigo() {
		Artigo a1 = new Artigo();
		a1.setCodigo_Artigo(1234);
		
		assertTrue(a1.getCodigo_Artigo() == 1234);
	}
	
	@Test
	void testGetPreco() {
		Artigo a1 = new Artigo();
		a1.setPreco(10);
		
		assertTrue(a1.getPreco() == 10);
	}
	
	@Test
	void testSetPreco() {
		Artigo a1 = new Artigo();
		a1.setPreco(10);
		
		assertTrue(a1.getPreco() == 10);
	}
}
