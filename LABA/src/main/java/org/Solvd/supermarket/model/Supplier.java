package org.Solvd.supermarket.model;

public class Supplier extends Person{
    private String email;

    //Constructors
    public Supplier(){
    }
    public Supplier(int id,String name,String address,String phoneNumber,String email){
        super(id,name,address,phoneNumber);
        this.setEmail(email);
    }
    public Supplier(int id,String name,String address){
        super(id,name,address);
    }

    //Setters
    public void setEmail(String email){
        this.email=email;
    }

    //Getters
    public String getEmail(){return this.email;}

    //Methods
    public void supply(ISupply supply,String text){
        supply.supply(text);
    }
    @Override
    public String toString(){
        return "Supplier{" +"Id='"+super.getId()+ ", name='" + super.getName() + ", email=" + this.getEmail() + ", phone number='" + super.getPhoneNumber()  +", address='" + super.getAddress() + '}';
    }
}
