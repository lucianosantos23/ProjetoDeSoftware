package br.edu.unifei.ecot12.spider;

import java.util.Date;

public class TransformacaoAranha {

    public Evento picadaAranha(String nomeHumano, String nomeAranha)
    {
        Fisico f1 = new Fisico();
        f1.setNome("Andar pelas paredes");
        f1.setPeso(1000);

        Fisico f2 = new Fisico();
        f2.setNome("Super Força");
        f2.setPeso(1000);

        Aranha a = new Aranha();
        a.setCodinome(nomeAranha);
        a.getPoderes().add(f1);
        a.getPoderes().add(f2);

        Humano h = new Humano();
        h.setNome(nomeHumano);
        h.setTotem(a);

        Evento e = new Evento();
        e.setDescricao("Transformação Aranha");
        e.setData(new Date()); //pega data atual
        e.getSeres().add(h);

        return e;
    }
}
