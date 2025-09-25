package com.industria.materiasprimas;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private float orcamento;
    private String sigla;
    private String localizacao;
    
    private Funcionario gerente;
    private List<Funcionario> funcionario = new ArrayList<Funcionario>();
    private List<Projeto> projetos = new ArrayList<Projeto>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public List<Funcionario> getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    
}
