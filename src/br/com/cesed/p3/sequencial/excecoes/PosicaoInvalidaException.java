package br.com.cesed.p3.sequencial.excecoes;

public class PosicaoInvalidaException extends RuntimeException{

    public PosicaoInvalidaException(String message) {
        super(message);
    }
}
