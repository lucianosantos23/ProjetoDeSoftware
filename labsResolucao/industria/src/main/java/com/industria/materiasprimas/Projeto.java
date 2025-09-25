package com.industria.materiasprimas;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private long id;
    private float orcamento;

    private List<Dedicacao> dedicacoes = new ArrayList<Dedicacao>();
    public List<Dedicacao> getDedicacoes() {
        return dedicacoes;
    }
    public void setDedicacoes(List<Dedicacao> dedicacoes) {
        this.dedicacoes = dedicacoes;
    }
    
    private Departamento departamento;
    private Funcionario gerente;
    private List<Componente> componentes = new ArrayList<Componente>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public List<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    
}
