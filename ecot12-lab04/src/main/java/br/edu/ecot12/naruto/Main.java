package br.edu.ecot12.naruto;

public class Main {
    public static void main(String[] args) {
        Shinobi n = new Shinobi();
        KekkeiGenkai r = new KekkeiGenkai();
        n.setNome("Nagato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKg().add(r);
    }
}