/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Valentina Andjelkovic 
 *
 */
public class TwitterPorukaTest {

	private TwitterPoruka tp;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp=new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp=null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnikOk() {
		
		tp.setKorisnik("Ivan");
		assertEquals("Ivan", tp.getKorisnik());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazan() {
		tp.setKorisnik("");
	}

	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPorukaOk() {
		String p= "Ne znam koji je bio moj prvi tvit, ali znam da ga niko nije procitao.";
		tp.setPoruka(p);
		assertEquals(p, tp.getPoruka());
				
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}
	

	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		tp.setKorisnik("Vucic");
 		tp.setPoruka("Danas je dan studenata #4april");
 		assertEquals("KORISNIK:" + "Vucic" + " PORUKA:" + "Danas je dan studenata #4april" , tp.toString());

	}

}
