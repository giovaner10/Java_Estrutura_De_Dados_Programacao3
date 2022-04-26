package br.com.cesed.p3.sequencial.excecoes;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(String message) {
        super(message);
    }
}
