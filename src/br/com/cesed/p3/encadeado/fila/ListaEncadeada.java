package br.com.cesed.p3.encadeado.fila;

public class ListaEncadeada {
    No inicio;
    int tamanho;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public void inserirFim(String info) {
        No no = new No();
        no.info = info;

        if (info == null) {
            no.proximo = null;
            inicio = no;
        } else {
            No local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = no;
            no.proximo = null;

        }
        tamanho++;
    }


    public String retirarInicio() {

        String removido;

        if (inicio == null) {
            removido = null;
        } else {
            removido = inicio.info;
            inicio = inicio.proximo;
            tamanho--;
        }
        return removido;
    }

    public String retirarFim() {

        String info = null;

        if (inicio == null) {
            info = null;
        } else if (tamanho > 1) {
            No local = inicio;
            while (local.proximo != null) {
                No aux = local;
                local = local.proximo;

                if (local.proximo == null) {
                    info = local.info;
                    aux.proximo = null;
                    tamanho--;

                }
            }
        } else if (tamanho == 1) {
            info = inicio.info;
            inicio = null;
        }

        return info;
    }

    public void inserirIndice(int indice, String info) {

        if (indice <= 0) {
            inserirInicio(info);
        } else if (indice >= tamanho) {
            inserirFim(info);
        } else {
            No no = new No();
            no.info = info;

            No local = inicio;
            No aux = local;

            for (int i = 0; i < indice; i++) {
                aux = local;
                local = local.proximo;
            }
            System.out.println(aux.info + " " + local.info);
            aux.proximo = no;
            no.proximo = local;
            tamanho++;

        }
    }

    public String removerIndice(int indice) {

        String info = null;

        if (indice <= 0) {
            retirarInicio();
        } else if (indice >= tamanho) {
            retirarInicio();
        } else {


            No local = inicio;
            No aux = local;

            for (int i = 0; i < indice ; i++) {
                aux = local;
                local = local.proximo;
            }
            System.out.println(aux.info + " " + local.info);

             info = local.info;
            aux.proximo = local.proximo;

            tamanho--;

        }

        return info;
    }


    @Override
    public String toString() {
        String str = "ListaEncadeada{" +
                "inicio=" + inicio +
                ", tamanho=" + tamanho +
                "} ";
        No local = inicio;
        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }

        return str;
    }


    public String lista() {

        String str = "";
        No local = inicio;
        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }

        return str;

    }


}
