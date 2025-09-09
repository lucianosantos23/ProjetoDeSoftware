package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dimensao {
	private String nome;
	private Date tempo;
	private List<Totem> totens = new ArrayList<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getTempo() {
		return tempo;
	}
	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	public List<Totem> getTotens() {
		return totens;
	}
	public void setTotens(List<Totem> totens) {
		this.totens = totens;
	}
	
}
