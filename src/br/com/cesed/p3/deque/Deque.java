package br.com.cesed.p3.deque;


public class Deque {

    private static final int ALOCACAO_INICIAL = 4;

    private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];

    private int inseridos;

    public void insertFirst(Object obj) {

        checarTamanhoArray();

        if (inseridos == 0) {
            arrayInterno[inseridos] = obj;
        }

        else {
            Object[] array = new Object[arrayInterno.length];

            for (int i = 0; i < inseridos; i++) {
                array[i+1] = arrayInterno[i];
            }

            array[0] = obj;
            arrayInterno=array;
        }

        inseridos++;

    }

    private void checarTamanhoArray() {

        if (inseridos == arrayInterno.length) {

            Object[] novoArray = new Object[inseridos + ALOCACAO_INICIAL];

            for (int i = 0; i < arrayInterno.length; i++) {
                novoArray[i] = arrayInterno[i];
            }

            arrayInterno = novoArray;
        }
    }

    public void insertLast(Object obj) {

        checarTamanhoArray();
        arrayInterno[inseridos] = obj;
        inseridos++;
    }

    public Object removeLast() {

        Object o = arrayInterno[inseridos-1];

        arrayInterno[inseridos-1] = null;
        inseridos--;

        return o;
    }

    public Object getFirst() {

        Object o = arrayInterno[0];

        return o;
    }

    public Object getLast() {

        Object o = arrayInterno[inseridos-1];

        return o;
    }


    public void removeFirst() {


        if (inseridos == 0) {
            arrayInterno[0] = null;
        }

        else {

            for (int i = 0; i < inseridos; i++) {
                arrayInterno[i] = arrayInterno[i+1];
            }

        }

        inseridos--;

    }


}