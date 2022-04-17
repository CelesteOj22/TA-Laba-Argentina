package org.Solvd.supermarket.model;

import org.Solvd.supermarket.exceptions.*;

import java.util.*;

public class Management<T> {
    private ArrayList<T> arrayList;

    public Management() {}
    public Management(ArrayList<T> arrayList) {
        this.setArrayList(arrayList) ;
    }

    public ArrayList<T> getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(T object){
        this.getArrayList().add(object);
    }

    public void removeEmployee(Employee object) throws EmployeeNotFoundException{
        if (this.getArrayList().contains(object)) {
            this.getArrayList().remove(object);
        }else {
            throw new EmployeeNotFoundException("This employee is not on the list, it cannot be remove");
        }
    }
    public void removeProduct(Product object,Sale sale) throws ProductNotFoundException{
        if (this.getArrayList().contains(object)) {
            this.getArrayList().remove(object);
            sale.setTotal(sale.getTotal()-object.getPrice());
        }else {
            throw new ProductNotFoundException("This product is not on the list, it cannot be remove");
        }
    }
    public void removeSale(Sale object) throws SaleNotFoundException{
        if (this.getArrayList().contains(object)) {
            this.getArrayList().remove(object);
        }else {
            throw new SaleNotFoundException("This sale is not on the list, it cannot be remove");
        }
    }

}
