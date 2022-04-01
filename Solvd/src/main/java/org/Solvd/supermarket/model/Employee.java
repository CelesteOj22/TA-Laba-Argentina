package org.Solvd.supermarket.model;
import java.util.Calendar;

public class Employee extends Person{
    private String position;
    private double wage;
    private int seniority;

    //Constructors
    public Employee(){
    }
    public Employee(String position,double wage,int seniority){
        this.setPosition(position);
        this.setWage(wage);
        this.setSeniority(seniority);
    }
    public Employee(int id, String name, int age, Calendar birth, String address, String phoneNumber,String position, double wage,int seniority){
        super(id,name,age,birth,address,phoneNumber);
        this.setPosition(position);
        this.setWage(wage);
        this.setSeniority(seniority);
    }

    //Setters
    public void setPosition(String position){
        this.position=position;
    }
    public void setWage(double wage){
        this.wage=wage;
    }
    public void setSeniority(int seniority){
        this.seniority=seniority;
    }

    //Getters
    public String getPosition(){
        return this.position;
    }
    public double getWage(){
        return this.wage;
    }
    public int getSeniority(){
        return this.seniority;
    }

    //Methods
    @Override
    public String toString() {
        return "Employee{" +"Id='"+super.getId()+ ", name='" + super.getName() + ", age=" + super.getAge() + ", date of birth='" + super.getBirth() + ", address='" + super.getAddress() + ", phone number='" + super.getPhoneNumber()  +", position='" + this.getPosition()  + ", wage='" + this.getWage()  +", seniority='" + this.getSeniority()  +'}';
    }

}
