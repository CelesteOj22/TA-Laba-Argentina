package org.Solvd.supermarket.exceptions;
import java.lang.RuntimeException;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(){}
    public EmployeeNotFoundException(String message){super(message);}
    public EmployeeNotFoundException(String message,Throwable cause){super(message,cause);}
}
