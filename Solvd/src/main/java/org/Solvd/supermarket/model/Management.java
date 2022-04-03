package org.Solvd.supermarket.model;

import org.Solvd.supermarket.exceptions.EmployeeNotFoundException;
import org.Solvd.supermarket.exceptions.ProductNotFoundException;

import java.util.*;

public class Management {
    private ArrayList arrayList;

    public Management() {}
    public Management(ArrayList arrayList) {
        this.setArrayList(arrayList) ;
    }

    public ArrayList getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }


    public void addEmployee(Employee employee){
        this.getArrayList().add(employee);
    }

    public void addProducts(Product product){
        this.getArrayList().add(product);
    }

    public void removeEmployee(Employee employee) throws EmployeeNotFoundException {
        if (this.getArrayList().contains(employee)) {
            this.getArrayList().remove(employee);
        }else{
            throw new EmployeeNotFoundException("This employee is not on the list, it cannot be remove");
        }
    }
    public void removeProduct(Product product) throws ProductNotFoundException {
        if (this.getArrayList().contains(product)) {
            this.getArrayList().remove(product);
        }else{
            throw new ProductNotFoundException("This product is not on the list, it cannot be remove");
        }
    }
}
