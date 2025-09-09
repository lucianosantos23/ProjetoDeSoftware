package br.edu.unifei.ecot12.eletrica;

public class App {
    public static void main(String[] args) 
    {
        Componente c111 = new Componente();
        Componente c112 = new Componente();
        Circuito c11 = new Circuito();

        c11.getElementos().add(c111);
        c11.getElementos().add(c112);
        
        Circuito c12 = new Circuito();
        Componente c13 = new Componente();
        Circuito c1 = new Circuito();

        c1.getElementos().add(c11);
        c1.getElementos().add(c12);
        c1.getElementos().add(c13);

        System.out.println("-----");
        System.out.println(c1.totalElementos());
    }
}
