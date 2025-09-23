package br.edu.unifei.ecot12.spider;

import java.util.Date;

public class Aranha extends Totem {
	private Date mordidaAranha;
	private Humano ente;
	public Date getMordidaAranha() {
		return mordidaAranha;
	}
	public void setMordidaAranha(Date mordidaAranha) {
		this.mordidaAranha = mordidaAranha;
	}
	public Humano getEnte() {
		return ente;
	}
	public void setEnte(Humano ente) {
		this.ente = ente;
	}
	
	
}
