package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro de comparação", 1, 2);
		// para double usamos o delta de comparação (semelhante a mascara)
		Assert.assertEquals(0.1234, 0.123, 0.001);
		
		// para tipos primitivos Wraper
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		// para strings
		Assert.assertEquals("bola", "bola");
		//Assert.assertEquals("bola", "Bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		//testando negação de equals
		Assert.assertNotEquals("bola", "Bola");
		
		// para objetos
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = u2;
		Usuario u4 = null;
		
		//Assert.assertEquals(u1, u1);
		Assert.assertEquals(u1, u2); // falha pois são objetos diferentes
		
		// para comparar mesma instancia de objetos
		//Assert.assertSame(u1, u2); // falha pois sao instancias diferentes
		Assert.assertSame(u3, u2);
		
		// testando negação de same
		Assert.assertNotSame(u1, u2);
		
		//para null
		Assert.assertTrue(u4 == null);
		assertNull(u4);
		
		// negacao de null
		assertNotNull(u3);
	}

}
