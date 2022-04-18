package br.com.cesed.p3.listasequencial;

import br.com.cesed.p3.excessoes.PosicaoInvalidaException;
import br.com.cesed.p3.excessoes.ValorInvalidoException;

public class ListaSequencial {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;


    public void add(Object novoElemento){
        if(novoElemento == null){
            throw new ValorInvalidoException("Elemento nulo nao pode ser inserido");
        }

        checarTamanho();
        arrayInterno[inseridos] = novoElemento;

        inseridos++;
    }

    public int size(){
        return inseridos;

    }

    public Object get(int index){
        if (index < 0 || index > arrayInterno.length){
            throw new PosicaoInvalidaException("Impossivel inseeri na posicao: " + index);
        }

        return arrayInterno[index];
    }

    public void clear(){
        inseridos = 0;
        arrayInterno = new Object[ALOCACAO_INICIAL];

    }

    public boolean isEmpty(){
        return inseridos == 0;
    }

    public Object remove(Object elemento){
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
