package org.Solvd.supermarket.model;
import java.util.*;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    private Calendar birth;
    private String address;
    private String phoneNumber;

    //Constructors
    public Person(){
    }
    public Person(int id, String name, int age, Calendar birth, String address, String phoneNumber){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setBirth(birth);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }

    public Person(int id, String name, int age, String address, String phoneNumber){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }
    Person(int id, String name, String address, String phoneNumber){
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }
    Person(int id, String name, String address){
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
    }

    //Seters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setBirth(Calendar birth){
        this.birth=birth;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Calendar getBirth(){
        return this.birth;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //Method
    @Override
    public String toString() {
        return "Person{" +"Id='"+this.getId()+ ", name='" + this.getName() + ", age=" + this.getAge() + ", date of birth='" + this.getBirth() + ", address='" + this.getAddress() + ", phone number='" + this.getPhoneNumber()  + '}';
    }
}
