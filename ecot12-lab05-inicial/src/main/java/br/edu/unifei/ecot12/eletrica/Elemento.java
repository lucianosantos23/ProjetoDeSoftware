package br.edu.unifei.ecot12.eletrica;

public abstract class Elemento {
    private String rotulo;
    public abstract int totalElementos();
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

}
