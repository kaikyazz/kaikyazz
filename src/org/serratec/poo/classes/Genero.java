package org.serratec.poo.classes;

public enum Genero {
		ROCK("R", "Rock"),
		POP("P", "Pop"),
		MPB("M","Mpb"),
		FUNK("F", "Funk"),
		TRAP("T", "Trap"),
		ELETRONICA("E", "Eletronica");
 
	private String descricaoTextual;
	private String sigla;
	
	
	private Genero(String descricaoTextual, String sigla) {
		this.descricaoTextual = descricaoTextual;
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricaoTextual() {
		return descricaoTextual;
	}

	
}