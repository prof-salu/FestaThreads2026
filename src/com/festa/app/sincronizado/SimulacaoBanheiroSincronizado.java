package com.festa.app.sincronizado;

public class SimulacaoBanheiroSincronizado {
    public static void main(String[] args) throws InterruptedException {
        String[] nomes = {"Joao", "Harry", "Gaby", "Gigi"};
        int[] tarefas = {1, 2, 1, 2};
        Thread[] threads = new Thread[4];

        BanheiroSincronizado banheiroCompartilhado = new BanheiroSincronizado();

        System.out.println("Iniciando simulacao com blocos synchronized\n");

        for (int i = 0; i < 4; i++) {
            Runnable tarefa = new TarefaBanheiroSincronizado(nomes[i], tarefas[i], banheiroCompartilhado);
            threads[i] = new Thread(tarefa);
            threads[i].start();
        }

        for (int i = 0; i < 4; i++) {
            threads[i].join();
        }

        System.out.println("\nTodos terminaram de usar o banheiro.");
    }
}

