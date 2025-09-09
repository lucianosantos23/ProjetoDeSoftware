package br.edu.unifei.ecot12.spider;

public class Main {
    public static void main(String[] args) {
        TransformacaoAranha t = new TransformacaoAranha();
        Evento e = t.picadaAranha("cindy", "silk" );
        System.out.println(e.getSeres().get(0).getNome());
    }
}