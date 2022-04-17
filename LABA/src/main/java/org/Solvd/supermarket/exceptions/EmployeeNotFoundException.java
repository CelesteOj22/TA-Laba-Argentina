package org.Solvd.supermarket.exceptions;

public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(){}
    public EmployeeNotFoundException(String message){super(message);}
    public EmployeeNotFoundException(String message,Throwable cause){super(message,cause);}
}
