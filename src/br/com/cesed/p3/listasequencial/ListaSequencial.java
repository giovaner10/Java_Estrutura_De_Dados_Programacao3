package br.com.cesed.p3.listasequencial;

public class ListaSequencial {

    public static final int ALOCACAO_INICIAL = 3;
    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;


    public void add(Object novoElemento){

        checarTamanho();
        arrayInterno[inseridos] = novoElemento;

        inseridos++;
    }

    public int size(){
        return inseridos;

    }

    public Object get(int index){
        return arrayInterno[index];
    }

    public void clear(){
        inseridos = 0;
        arrayInterno = new Object[ALOCACAO_INICIAL];

    }

    public boolean isEmpty(){
        return inseridos == 0;
    }

    public void remove(Object elemento){

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
