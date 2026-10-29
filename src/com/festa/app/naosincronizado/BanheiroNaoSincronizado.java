package com.festa.app.naosincronizado;

class BanheiroNaoSincronizado {

    // Repassamos a obrigatoriedade de tratar a exceção adicionando "throws"
    public void fazNumero1(String nome) throws InterruptedException {
        System.out.println(nome + " entrou no vestiário e foi para a fila da cabine");

        System.out.println(nome + " entrou na cabine");
        System.out.println(nome + " fazendo coisa rapida");
        Thread.sleep(8000);
        System.out.println(nome + " dando descarga");
        Thread.sleep(3000);
        System.out.println(nome + " saindo da cabine");

        System.out.println(nome + " lavando a mao na pia externa compartilhada");
        Thread.sleep(3000);
        System.out.println(nome + " saindo do vestiário");
        Thread.sleep(1000);
    }

    public void fazNumero2(String nome) throws InterruptedException {
        System.out.println(nome + " entrou no vestiário e foi para a fila da cabine");

        System.out.println(nome + " entrou na cabine");
        System.out.println(nome + " fazendo coisa demorada");
        Thread.sleep(15000);
        System.out.println(nome + " dando descarga");
        Thread.sleep(3000);
        System.out.println(nome + " saindo da cabine");

        System.out.println(nome + " lavando a mao na pia externa compartilhada");
        Thread.sleep(3000);
        System.out.println(nome + " saindo do vestiário");
        Thread.sleep(1000);
    }
}

