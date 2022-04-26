package br.com.cesed.p3.encadeado.pilha;

import br.com.cesed.p3.encadeado.Conta;

public class PilhaEncadeada {

    private Conta cabeca; //primeiro elemento
    private int inseridos;

    public void push(Conta novaConta){
        if(inseridos == 0){
            cabeca = novaConta;
        }else {
            Conta temp = cabeca;

            while (temp.proximo != null){
                temp = temp.proximo;
            }
            temp.proximo = novaConta;

        }
        inseridos++;
    }


    public Conta pop(Conta novaConta){

        Conta removido = null;

        if(inseridos == 0){
            removido = null;
        }else if(inseridos == 1) {
            removido = cabeca;
            cabeca = null;
            inseridos--;

        }else if(inseridos > 1){

            Conta temp = cabeca;

            while (temp.proximo != null){
                temp = temp.proximo;
            }
            removido = temp.proximo;
            temp.proximo = null;

            inseridos--;

        }
        return  removido;
    }


    public int size(){
        return inseridos;

    }

    public boolean isEmpty(){
        return size() == 0;
    }

}
