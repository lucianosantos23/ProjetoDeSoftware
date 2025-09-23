package br.edu.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int numero;
    private boolean ativo;
    private List<Missao> missoes = new ArrayList <Missao>();
    private Shinobi shinobis [] = new Shinobi[4];
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public List<Missao> getMissoes() {
        return missoes;
    }
    public void setMissoes(List<Missao> missoes) {
        this.missoes = missoes;
    }
    public Shinobi[] getShinobis() {
        return shinobis;
    }
    public void setShinobis(Shinobi[] shinobis) {
        this.shinobis = shinobis;
    }

}
