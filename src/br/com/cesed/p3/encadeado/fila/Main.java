package br.com.cesed.p3.encadeado.fila;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirInicio("nome 0");
        lista.inserirInicio("nome 1");
        lista.inserirInicio("nome 2");
        lista.inserirInicio("nome 3");
        lista.inserirFim("no fim 1");
        lista.inserirFim("no fim 2");

        System.out.println(lista.lista());
        System.out.println();

        while (lista.retirarInicio() != null){
            System.out.println(lista.lista());
        }
        System.out.println("fim");

    }
}
