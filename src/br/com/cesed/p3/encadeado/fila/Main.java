package br.com.cesed.p3.encadeado.fila;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirInicio("0");
        lista.inserirInicio("1");
        lista.inserirInicio("2");
        lista.inserirInicio("3");
        lista.inserirInicio("4");
        lista.inserirInicio("5");

        System.out.println(lista.lista());
       // lista.retirarFim();
     //   System.out.println();
        lista.inserirIndice(4, "INSERIDO");

        System.out.println(lista.lista());

        System.out.println(lista.removerIndice(4));
        System.out.println(lista.lista());





        /*while (lista.retirarInicio() != null){
            System.out.println(lista.lista());
        }
        System.out.println("fim");
*/
    }
}
