package br.com.cesed.p3.fila;

import br.com.cesed.p3.excecoes.PosicaoInvalidaException;
import br.com.cesed.p3.excecoes.ValorInvalidoException;

public class Fila {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;


    /**
     *
     * @param novoElemento Adiciona um novo elemento.
     */
    public void enqueue(Object novoElemento) {
        if (novoElemento == null) {
            throw new ValorInvalidoException("Elemento nulo nao pode ser inserido");
        }

        checarTamanho();
        arrayInterno[inseridos] = novoElemento;

        inseridos++;
    }

    /**
     *
     * @return O tamanho da Fila.
     */
    public int size() {
        return inseridos;

    }

    /**
     *
     * @param index Recebe esse paramentro, do elemento a ser removido.
     * @return Retorna o elemento da posição index.
     */
    public Object get(int index) {
        if (index < 0 || index > arrayInterno.length) {
            throw new PosicaoInvalidaException("Impossivel inseeri na posicao: " + index);
        }

        return arrayInterno[index];
    }

    /**
     * Limpa a Fila.
     */
    public void clear() {
        inseridos = 0;
        arrayInterno = new Object[ALOCACAO_INICIAL];

    }

    /**
     *
     * @return Retorna se Fila esta vazia.
     */
    public boolean isEmpty() {
        return inseridos == 0;
    }

    /**
     *
     * @return Remove o ultimo elemento e o retorna.
     */
    public Object dequeue() {

        Object objectRemovido = arrayInterno[0];

        if (inseridos > 0) {
            for (int i = 0; i < inseridos; i++) {
                arrayInterno[i] = arrayInterno[i + 1];
            }
            inseridos--;
        }
        return objectRemovido;

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
