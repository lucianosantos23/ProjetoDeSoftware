package br.edu.ecot12.naruto;

public abstract class Jutsu {
    private String nome;
    private boolean proibido;
    private String efeito;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isProibido() {
        return proibido;
    }
    public void setProibido(boolean proibido) {
        this.proibido = proibido;
    }
    public String getEfeito() {
        return efeito;
    }
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
}
