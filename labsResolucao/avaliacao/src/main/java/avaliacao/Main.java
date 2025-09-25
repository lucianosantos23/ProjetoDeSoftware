package avaliacao;

public class Main {
    public static void main(String[] args) {
        Avaliacao av = new Avaliacao();
        av.setNota1(6);
        av.setNota2(3);
        av.setSub(6);
        av.setPresenca(24);
        if( av.aprovado() ) System.out.printf("Aprovado com %.2f\n", av.media());
            else System.out.printf("Reprovado com %.2f\n", av.media());
    }
}