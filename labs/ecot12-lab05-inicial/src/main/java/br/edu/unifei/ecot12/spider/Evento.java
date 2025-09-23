package br.edu.unifei.ecot12.spider;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Evento {
	private String descricao;
	private Date data;
	private List<Ser> seres = new ArrayList<>();
	private List<Profecia> profecias = new ArrayList<>();
	private Dimensao dimensao;
	
	public String maiorOcorrencia() {
		int maior = 0;
		String res = "";
		String minusculo = descricao.toLowerCase();
		String palavras[] = minusculo.split(" ");
		//hash chave = palavras únicas / valor = contagem
		HashMap<String, Integer> ocorre = new HashMap<>();		
		for (int i = 0; i < palavras.length; i++) {
			Integer cont = ocorre.get(palavras[i]);
			if(cont == null) {				
				ocorre.put(palavras[i], 0);
			}else {
				ocorre.put(palavras[i], ++cont);				
				if(cont > maior) {
					maior = cont;
					res = palavras[i];
				}			
			}
		}
		return res;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Ser> getSeres() {
		return seres;
	}
	public void setSeres(List<Ser> seres) {
		this.seres = seres;
	}
	public List<Profecia> getProfecias() {
		return profecias;
	}
	public void setProfecias(List<Profecia> profecias) {
		this.profecias = profecias;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	

}
