package org.Solvd.supermarket.model;

public class Supermarket {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    //Constructors
    public Supermarket(){}
    public Supermarket(int id, String name,String address,String phoneNumber){
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    //Getters
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public String getPhoneNumber(){return this.phoneNumber;}

    @Override
    public String toString() {
        return "Supermarket{" +"Id='"+this.getId()+ ", name='" + this.getName() +", address='" + this.getAddress() + ", phone number='" + this.getPhoneNumber() + '}';
    }
}

