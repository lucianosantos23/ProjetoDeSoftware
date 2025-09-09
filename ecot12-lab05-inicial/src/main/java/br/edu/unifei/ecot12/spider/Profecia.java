package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.List;

public class Profecia {
	private String relato;
	private List<Ser> seres = new ArrayList<>();
	public String getRelato() {
		return relato;
	}
	public void setRelato(String relato) {
		this.relato = relato;
	}
	public List<Ser> getSeres() {
		return seres;
	}
	public void setSeres(List<Ser> seres) {
		this.seres = seres;
	}
	
}
