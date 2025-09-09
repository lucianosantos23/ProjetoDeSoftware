package br.eng.mitologia.thor;

import java.util.Date;

public abstract class Mortal extends Ser {
    private Date nascimento;
    private Divindade hospeda;
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public Divindade getHospeda() {
        return hospeda;
    }
    public void setHospeda(Divindade hospeda) {
        this.hospeda = hospeda;
    }
}
