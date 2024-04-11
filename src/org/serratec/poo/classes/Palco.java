package org.serratec.poo.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Evento;

public class Palco {
	private String nome;
	private int capacidade;
	List<Evento> eventos = new ArrayList<>();
	
	public Palco(String nome, int capacidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public void adicionarEventos() {
	}

	@Override
	public String toString() {
		return "Palco [nome=" + nome + ", capacidade=" + capacidade + ", eventos=" + eventos + "]";
	}
	public void adicionarEventos(Evento evento) {
		this.eventos.add(evento);
	}
	
}
