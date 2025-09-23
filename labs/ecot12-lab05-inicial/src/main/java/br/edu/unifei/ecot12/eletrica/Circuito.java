package br.edu.unifei.ecot12.eletrica;

import java.util.ArrayList;
import java.util.List;

public class Circuito extends Elemento{
    private CaminhoEnum caminho;
    private boolean aberto;
    private List<Elemento> elementos = new ArrayList<Elemento>();

    
    public CaminhoEnum getCaminho() {
        return caminho;
    }
    public void setCaminho(CaminhoEnum caminho) {
        this.caminho = caminho;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public List<Elemento> getElementos() {
        return elementos;
    }
    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }


    @Override
    public int totalElementos() {
        int soma = 1;
        for (Elemento e : elementos) {
            //System.out.println("O elemento = "+e);
            soma += e.totalElementos();
        }
        return soma;
    }
    
}
