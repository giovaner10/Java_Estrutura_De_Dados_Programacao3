package br.com.cesed.p3.pilhas;

import br.com.cesed.p3.excessoes.ValorInvalidoException;

public class Pilhas {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;

    /**
     * Metodo que serve para adicionar um novo elemento.
     *
     * @param novoElemento Elemento que vai ser adicionado.
     */
    public void push(Object novoElemento) {
        if (novoElemento == null) {
            throw new ValorInvalidoException("Elemento nulo nao pode ser inserido");
        }
        checarTamanho();
        arrayInterno[inseridos] = novoElemento;
        inseridos++;
    }

    /**
     * Metodo que remove o ultimo elemento.
     *
     * @return O elemneto que foi removido
     */
    public Object pop() {
        Object objectRemovido = arrayInterno[inseridos - 1];
        arrayInterno[inseridos - 1] = null;
        inseridos--;
        return objectRemovido;
    }

    /**
     * @return O elemento que esta no topo da pilha.
     */
    public Object top() {
        return arrayInterno[inseridos - 1];
    }

    /**
     * @return o elemento que esta no topo da pilha
     */
    public Object peek() {
        return top();
    }

    /**
     * @return O tamanho da pilha.
     */
    public int size() {
        return inseridos;
    }


    public void checarTamanho() {
        if (inseridos == arrayInterno.length) {
            Object[] novoArray = new Object[inseridos + ALOCACAO_INICIAL];
            for (int i = 0; i < arrayInterno.length; i++) {
                novoArray[i] = arrayInterno[i];
            }
            arrayInterno = novoArray;
        }
    }
}
