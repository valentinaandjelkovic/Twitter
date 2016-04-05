/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author Valentina Andjelkovic
 *
 */
public class TwitterTest {
	
	Twitter t;
	
	@Before
	public void setUp() throws Exception {
		t=new Twitter();

	}
	@After
	public void tearDown() throws Exception {
		t=null;
	}

	
	@Test 
	public void testVratiSvePorukeOk() {
		t.vratiSvePoruke();
	}

	@Test 
	public void testUnesi() {
		t.unesi("Valentina", "Mrzim radne subote");
	
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiNull(){
		String korisnik=null;
		String poruka=null;
		t.unesi(korisnik, poruka);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiPrazanString(){
		String korisnik="";
		String poruka="";
		t.unesi(korisnik, poruka);
	}
	
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiDuguPoruku(){
		String poruka=null;
		for(int i=0; i<100; i++){
			poruka+=" smor ";
		}
		t.unesi("Vucic", poruka);
	}
	
	
	@Test 
	public void testUnesiOk(){
	
	
	t.unesi("Vucic", "Pobedicemo! #izbori2016");
	
	TwitterPoruka tp = new TwitterPoruka();
	
	tp.setKorisnik("Vucic");
	tp.setPoruka("Pobedicemo! #izbori2016");
	
	assertEquals(tp.toString(), t.vratiSvePoruke().getLast().toString());
	
	}
	
	
	
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukePrazanString(){
		t.vratiPoruke(10, "");
	}
	

	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull(){
		t.vratiPoruke(10, null);
	}
	
	@Test 
	public void testVratiPorukeSveOk (){
		t.vratiPoruke(20, "#foncy");
	}
	}
	
	
	


