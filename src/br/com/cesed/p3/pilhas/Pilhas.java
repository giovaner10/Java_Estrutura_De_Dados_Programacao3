package br.com.cesed.p3.pilhas;

public class Pilhas {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;


    public void push(Object novoElemento){

        checarTamanho();
        arrayInterno[inseridos] = novoElemento;
        inseridos++;

    }

    public Object pop(){
        Object objectRemovido = arrayInterno[inseridos - 1];
        arrayInterno[inseridos - 1] = null;
        inseridos--;
        return objectRemovido;
    }

    public Object top(){
        return arrayInterno[inseridos-1];
    }

    public Object peek(){
        return top();
    }

    public int size(){
        return inseridos;
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
