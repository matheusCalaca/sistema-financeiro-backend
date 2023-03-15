package br.com.matheuscalaca.sistema.financeiro.excption;

public class AlreadyExistsException extends RuntimeException{

    public  AlreadyExistsException(String msg){
        super(msg);
    }

}
