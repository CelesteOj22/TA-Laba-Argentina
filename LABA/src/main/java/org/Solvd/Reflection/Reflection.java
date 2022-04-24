package org.Solvd.Reflection;
import org.Solvd.supermarket.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.lang.reflect.*;
import java.util.stream.*;


public class Reflection {
    private static final Logger LOGGER = LogManager.getLogger(Reflection.class);

    public static void main(String[] args){
    Object employee= new Employee();
    Constructor[] cons = employee.getClass().getDeclaredConstructors();
    for(Constructor consList : cons){
        LOGGER.info("Constructor " + consList.getName()+"("+ Arrays.stream(consList.getParameterTypes()).toList()+")");
    }

    Field[] fields = employee.getClass().getDeclaredFields();
    LOGGER.info("Fields " + Arrays.stream(fields).toList());

    Method[] methods = employee.getClass().getDeclaredMethods();
    LOGGER.info("Methods " + Arrays.stream(methods).toList());
    }
}




