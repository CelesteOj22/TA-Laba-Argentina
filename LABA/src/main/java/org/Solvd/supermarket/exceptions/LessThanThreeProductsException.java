package org.Solvd.supermarket.exceptions;

import java.io.IOException;
import java.lang.Throwable;

public class LessThanThreeProductsException extends IOException {
    public LessThanThreeProductsException(){}
    public LessThanThreeProductsException(String message){super(message);}
    public LessThanThreeProductsException(String message,Throwable cause){super(message,cause);}
}
