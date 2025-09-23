package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.List;

public class Herdeiro extends Ser {
	private int estimativaVida;
	private List<Aranha> absorveAranhas = new ArrayList<>();	
	private List<Poder> poderes =  new ArrayList<>();
	public int getEstimativaVida() {
		return estimativaVida;
	}
	public void setEstimativaVida(int estimativaVida) {
		this.estimativaVida = estimativaVida;
	}
	public List<Aranha> getAbsorveAranhas() {
		return absorveAranhas;
	}
	public void setAbsorveAranhas(List<Aranha> absorveAranhas) {
		this.absorveAranhas = absorveAranhas;
	}
	public List<Poder> getPoderes() {
		return poderes;
	}
	public void setPoderes(List<Poder> poderes) {
		this.poderes = poderes;
	}
	
}
