package org.Solvd.supermarket.exceptions;

public class NotEnoughFundsException extends Exception{
    public NotEnoughFundsException(){}
    public NotEnoughFundsException(String message){super(message);}
    public NotEnoughFundsException(String message,Throwable cause){super(message,cause);}
}
