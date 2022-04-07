package org.Solvd.supermarket.model;

import java.util.*;

public class Branch extends Supermarket{
    private String city;
    private Employee manager;
    private ArrayList<Employee> employees;

    //Constructors
    public Branch(){
    }
    public Branch(int id,String name,String address,String phoneNumber,String city, Employee manager,ArrayList<Employee> employees){
        super(id,name,address,phoneNumber);
        this.setCity(city);
        this.setManager(manager);
        this.setEmployees(employees);
    }
    public Branch(int id,String name,String address,String phoneNumber,String city){
        super(id,name,address,phoneNumber);
        this.setCity(city);
    }

    //Setters
    public void setCity(String city){
        this.city=city;
    }
    public void setManager(Employee manager){
        this.manager=manager;
    }
    public void setEmployees(ArrayList<Employee> employee){
        this.employees=employees;
    }

    //Getters
    public String getCity(){return this.city;}
    public Employee getManager(){return this.manager;}
    public ArrayList<Employee> getEmployees(){return this.employees;}

    //Methods
    public String toString() {
        return "Branch{" + "Id='" + super.getId() +  ", name='" + super.getName() + ", address='" + super.getAddress() +", phone number='" + super.getPhoneNumber() + ", city='" + this.getCity() + ", manager=" + this.getManager() + ",employees=" +this.getEmployees()+'}';
    }
}
