package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.List;

public class Luta extends Evento {
	private LadoEnum ladoVencedor;
	private List<Ser> seresMortos = new ArrayList<>();
	public LadoEnum getLadoVencedor() {
		return ladoVencedor;
	}
	public void setLadoVencedor(LadoEnum ladoVencedor) {
		this.ladoVencedor = ladoVencedor;
	}
	public List<Ser> getSeresMortos() {
		return seresMortos;
	}
	public void setSeresMortos(List<Ser> seresMortos) {
		this.seresMortos = seresMortos;
	}

}
