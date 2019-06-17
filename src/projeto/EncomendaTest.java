package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncomendaTest {

	@Test
	void testGetNumero() {
		Encomenda e1 = new Encomenda();
		e1.setNumero(10);
		
		assertTrue(e1.getNumero() == 10);
	}

	@Test
	void testSetNumero() {
		Encomenda e1 = new Encomenda();
		e1.setNumero(10);
		
		assertTrue(e1.getNumero() == 10);
	}

	@Test
	void testGetData() {
		Encomenda e1 = new Encomenda();
		e1.setData("12/12/19");
		
		assertTrue(e1.getData() == "12/12/19");
	}

	@Test
	void testSetData() {
		Encomenda e1 = new Encomenda();
		e1.setData("12/12/19");
		
		assertTrue(e1.getData() == "12/12/19");
	}

	@Test
	void testGetQuantidade() {
		Encomenda e1 = new Encomenda();
		e1.setQuantidade(80);
		
		assertTrue(e1.getQuantidade() == 80);
	}

	@Test
	void testSetQuantidade() {
		Encomenda e1 = new Encomenda();
		e1.setQuantidade(80);
		
		assertTrue(e1.getQuantidade() == 80);
	}

}
