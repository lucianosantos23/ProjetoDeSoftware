package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String nome;
	private String objetivo;
	private Dimensao dimensao;
	private List<Ser> seres = new ArrayList<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	public List<Ser> getSeres() {
		return seres;
	}
	public void setSeres(List<Ser> seres) {
		this.seres = seres;
	}
	
	
}
