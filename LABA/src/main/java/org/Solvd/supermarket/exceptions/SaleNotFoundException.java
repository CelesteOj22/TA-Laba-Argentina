package org.Solvd.supermarket.exceptions;

public class SaleNotFoundException extends RuntimeException{
    public SaleNotFoundException(){}
    public SaleNotFoundException(String message){super(message);}
    public SaleNotFoundException(String message,Throwable cause){super(message,cause);}
}
