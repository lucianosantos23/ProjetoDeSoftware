package br.edu.ecot12.naruto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shinobi extends Ser {
    private String sexo;
    private Date nascimento;
    private String categoria;
    private boolean renegado;
    private Bijuu bijuu;
    private Cla cla;
    private List <KekkeiGenkai> kg = new ArrayList<KekkeiGenkai>();


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isRenegado() {
        return renegado;
    }
    public void setRenegado(boolean renegado) {
        this.renegado = renegado;
    }
    public Bijuu getBijuu() {
        return bijuu;
    }
    public void setBijuu(Bijuu bijuu) {
        this.bijuu = bijuu;
    }
    public Cla getCla() {
        return cla;
    }
    public void setCla(Cla cla) {
        this.cla = cla;
    }
    public List<KekkeiGenkai> getKg() {
        return kg;
    }
    public void setKg(List<KekkeiGenkai> kg) {
        this.kg = kg;
    }
}
