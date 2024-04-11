package org.serratec.poo.classes;

public class Artista {
	private String nome;
	private Genero genero;
	private double cache;

	public Artista(String nome, Genero genero, double cache) {
		super();
		this.nome = nome;
		this.cache = cache;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public double getCache() {
		return cache;
	}
	
	public double getGenero() {
		return cache;
	}
	

	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", genero=" + genero.getSigla() + ", cache=" + cache + "]";
	}
	
	
	
	
	
	
}
