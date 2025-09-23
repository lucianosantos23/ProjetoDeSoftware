package br.edu.ecot12.naruto;

public class KekkeiGenkai {
    private String nome;
    private String caracteristica;
    private String descricao;
    private boolean ativado;
    private Cla cla;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isAtivado() {
        return ativado;
    }
    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }
    public Cla getCla() {
        return cla;
    }
    public void setCla(Cla cla) {
        this.cla = cla;
    }
}
