package br.eng.mitologia.thor;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private boolean vivo;
    private String moradia;
    private List<Ser> filhos = new ArrayList<Ser>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public String getMoradia() {
        return moradia;
    }
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
}
