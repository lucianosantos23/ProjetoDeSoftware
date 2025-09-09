package br.edu.unifei.ecot12.spider;

import java.util.Date;

public class Humano extends Ser{
	private Date nascimento;
	private Totem totem;
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Totem getTotem() {
		return totem;
	}
	public void setTotem(Totem totem) {
		this.totem = totem;
	}
	
}
