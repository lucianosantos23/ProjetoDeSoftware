package com.industria.materiasprimas;

public class Main {
    public static void main(String[] args) {
        // o projeto 100 é do departamento de vendas
        // o zé trabalha 5 horas no projeto 100 
        // maria trabalha 10 horas no projeto 100
        // joao é o gerente do projeto 100
        Funcionario z = new Funcionario();
        z.setNome("Zé");
        Dedicacao d1 = new Dedicacao();
        d1.setFuncionario(z);
        d1.setHorasTrabalho(5);
        Funcionario m = new Funcionario();
        m.setNome("Maria");
        Dedicacao d2 = new Dedicacao();
        d2.setFuncionario(m);
        d2.setHorasTrabalho(10);

        Funcionario j = new Funcionario();
        j.setNome("joao");
        Projeto p = new Projeto();
        p.setId(100);
        p.getDedicacoes().add(d1);
        p.getDedicacoes().add(d2);
        p.setGerente(j);
        for(Dedicacao d : p.getDedicacoes()) {
            System.out.println(d.getFuncionario().getNome());
        }


    }
}