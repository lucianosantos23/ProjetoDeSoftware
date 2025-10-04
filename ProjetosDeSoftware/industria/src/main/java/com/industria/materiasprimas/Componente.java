package com.industria.materiasprimas;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nome;
    private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }
    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    
}
