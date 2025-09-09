package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.List;

public abstract class Totem {
	private String codinome;
	private LadoEnum lado;
	private List<Equipamento> equipamentos = new ArrayList<>();
	private List<Poder> poderes =  new ArrayList<>();
	public String getCodinome() {
		return codinome;
	}
	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}
	public LadoEnum getLado() {
		return lado;
	}
	public void setLado(LadoEnum lado) {
		this.lado = lado;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public List<Poder> getPoderes() {
		return poderes;
	}
	public void setPoderes(List<Poder> poderes) {
		this.poderes = poderes;
	}
	
}
