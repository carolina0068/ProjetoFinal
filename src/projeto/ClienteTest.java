package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testGetNome_Cliente() {
		Cliente c1 = new Cliente();
		c1.setNome_Cliente("manel");
		
		assertTrue( c1.getNome_Cliente() == "manel");
	}
	
	@Test
	void testSetNome_Cliente() {
		Cliente c1 = new Cliente();
		c1.setNome_Cliente("manel");
		
		assertTrue( c1.getNome_Cliente() == "manel");
	}

	@Test
	void testGetMorada() {
		Cliente c1 = new Cliente();
		c1.setMorada("santarem");
		
		assertTrue( c1.getMorada() == "santarem");
	}
	
	@Test
	void testSetMorada() {
		Cliente c1 = new Cliente();
		c1.setMorada("santarem");
		
		assertTrue( c1.getMorada() == "santarem");
	}

	@Test
	void testGetCodigo_Postal() {
		Cliente c1 = new Cliente();
		c1.setCodigo_Postal(1235);
		assertTrue( c1.getCodigo_Postal() == 1235);
	}
	
	@Test
	void testSetCodigo_Postal() {
		Cliente c1 = new Cliente();
		c1.setCodigo_Postal(1235);
		assertTrue( c1.getCodigo_Postal() == 1235);
	}

}
