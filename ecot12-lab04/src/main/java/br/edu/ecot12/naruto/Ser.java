package br.edu.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private String apelido;
    private int chakra;
    private EntidadePolitica governa;
    private List<Artefato> artefatos = new ArrayList<Artefato>();
    private List <Jutsu> jutsus = new ArrayList<Jutsu>();
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getChakra() {
        return chakra;
    }
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
    public EntidadePolitica getGoverna() {
        return governa;
    }
    public void setGoverna(EntidadePolitica governa) {
        this.governa = governa;
    }
    public List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    public List<Jutsu> getJutsus() {
        return jutsus;
    }
    public void setJutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
