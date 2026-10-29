package com.festa.app.sincronizado;

class TarefaBanheiroSincronizado implements Runnable {
    private String nome;
    private int tipoTarefa;
    private BanheiroSincronizado banheiro;

    public TarefaBanheiroSincronizado(String nome, int tipoTarefa, BanheiroSincronizado banheiro) {
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

