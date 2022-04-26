package br.com.cesed.p3.sequencial.lista;

import br.com.cesed.p3.sequencial.excecoes.PosicaoInvalidaException;
import br.com.cesed.p3.sequencial.excecoes.ValorInvalidoException;

public class ListaSequencial {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;

    /**
     * Metodo que serve para adicionar um novo elemento.
     *
     * @param novoElemento Elemento que vai ser adicionado.
     */
    public void add(Object novoElemento){
        if(novoElemento == null){
            throw new ValorInvalidoException("Elemento nulo nao pode ser inserido");
        }

        checarTamanho();
        arrayInterno[inseridos] = novoElemento;

        inseridos++;
    }

    /**
     *
     * @return O tamanho da lista.
     */
    public int size(){
        return inseridos;

    }

    /**
     *
     * @param index Busca um objeto na lista com esse index.
     * @return Retorna o objeto com o index.
     */
    public Object get(int index){
        if (index < 0 || index > arrayInterno.length){
            throw new PosicaoInvalidaException("Impossivel inseeri na posicao: " + index);
        }

        return arrayInterno[index];
    }

    /**
     * Limpa a lista.
     */
    public void clear(){
        inseridos = 0;
        arrayInterno = new Object[ALOCACAO_INICIAL];

    }

    /**
     *
     * @return Retorna se a lista esta vazia ou não.
     */
    public boolean isEmpty(){
        return inseridos == 0;
    }

    /**
     *
     * @return Remove o ultimo o elemento e o retorna.
     */
    public Object remove(){
        Object objectRemovido = arrayInterno[inseridos - 1];
        arrayInterno[inseridos - 1] = null;
        inseridos--;
        return objectRemovido;

    }

    public void checarTamanho(){
        if(inseridos == arrayInterno.length){
            Object[] novoArray = new Object[inseridos + ALOCACAO_INICIAL];
            for(int i = 0; i < arrayInterno.length; i++){
                novoArray[i] = arrayInterno[i];
            }
            arrayInterno = novoArray;
        }
    }
}
