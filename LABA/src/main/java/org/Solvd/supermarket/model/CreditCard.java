package org.Solvd.supermarket.model;
import java.util.*;

public class CreditCard {
    private String name;
    private Bank bank;
    private String type;
    private int number;
    private int code;
    private Calendar expDate;

    //Constructors
    public CreditCard(){}
    public CreditCard(String name,Bank bank,String type,int number,int code,Calendar expDate){
        this.setName(name);
        this.setBank(bank);
        this.setType(type);
        this.setNumber(number);
        this.setCode(code);
        this.setExpDate(expDate);
    }

    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setBank(Bank bank){
        this.bank=bank;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setCode(int code){
        this.code=code;
    }
    public void setExpDate(Calendar expDate){
        this.expDate=expDate;
    }

    //Getters
    public String getName(){return this.name;}
    public Bank getBank(){return this.bank;}
    public String getType(){return this.type;}
    public int getNumber(){return this.number;}
    public int getCode(){return this.code;}
    public Calendar getExpDate(){return this.expDate;}

    //Methods
    @Override
    public String toString(){
        return "CreditCard{" + "nombre='" + this.getName() + ", bank='" + this.getBank() +", type='" + this.getType() + ", number='" + this.getNumber() +", code='" + this.getCode() +", expiration date='" + this.getExpDate() +'}';
    }
}
