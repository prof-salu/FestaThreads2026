package com.festa.app.naosincronizado;

public class SimulacaoBanheiroNaoSincronizado {
    public static void main(String[] args) throws InterruptedException {
        String[] nomes = {"Joao", "Harry", "Gaby", "Gigi"};
        int[] tarefas = {1, 2, 1, 2};
        Thread[] threads = new Thread[4];

        BanheiroNaoSincronizado banheiro = new BanheiroNaoSincronizado();

        System.out.println("Iniciando simulacao sem bloco synchronized\n");

        for (int i = 0; i < 4; i++) {
            Runnable tarefa = new TarefaBanheiroNaoSincronizado(nomes[i], tarefas[i], banheiro);
            threads[i] = new Thread(tarefa);
            threads[i].start();
        }

        for (int i = 0; i < 4; i++) {
            threads[i].join();
        }

        System.out.println("\nTodos terminaram de usar o banheiro.");
    }
}


