package com.festa.app.naosincronizado;


class TarefaBanheiroNaoSincronizado implements Runnable {
    private String nome;
    private int tipoTarefa;
    private BanheiroNaoSincronizado banheiro;

    public TarefaBanheiroNaoSincronizado(String nome, int tipoTarefa, BanheiroNaoSincronizado banheiro) {
        this.nome = nome;
        this.tipoTarefa = tipoTarefa;
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        try {
            if (this.tipoTarefa == 1) {
                banheiro.fazNumero1(nome);
            } else if (this.tipoTarefa == 2) {
                banheiro.fazNumero2(nome);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrompida: " + e.getMessage());
        }
    }
}


