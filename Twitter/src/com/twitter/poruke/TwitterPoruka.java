package com.twitter.poruke;

/**
 * Ovo je klasa koja predstavlja twitter poruku
 * @author Valentina Andjelkovic
 * @version 0.1
 *
 */
public class TwitterPoruka {
	/**
	 * atribut korisnik koji predstavlja ime korisnika
	 */
	private String korisnik;
	
	/**
	 * atribut poruka
	 */
	private String poruka;

	
	/**
	 * Vraca atribut korisnik
	 * @return korisnika
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * Postavlja vrednost atributa korisnik
	 * @param korisnik
	 * @throws java.lang.RuntimeException ukoliko je korisnik
	 * <ul>
	 * 		<li> null </li>
	 * 		<li> prazan String </li>
	 * </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	
	/**
	 * Vraca vrednost atributa poruka
	 * @return poruka
	 */
	public String getPoruka() {
		return poruka;
	}

	
	/**
	 * Postavlja vrednost atributa poruka
	 * @param poruka
	 * @throws java.lang.RuntimeException  ako je poruka
	 * 
	 * <ul> 
	 * 		<li>null</li>
	 * 		<li>duzina poruke veca od 140</li>
	 * </ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	/**
	 * Generise ispis atributa korisnik i poruka
	 */
	
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}

}
