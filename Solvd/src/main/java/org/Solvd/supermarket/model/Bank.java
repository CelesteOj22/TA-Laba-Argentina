package org.Solvd.supermarket.model;

public class Bank {
    private int id;
    private String name;
    private String address;
    private String email;

    //Constructors
    public Bank(){}
    public Bank(int id, String name,String address, String email){
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
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
    public void setEmail(String email){
        this.email=email;
    }
    //Getters
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public String getEmail(){return this.email;}

    //Methods
    @Override
    public String toString(){
        return "Bank{" + "Id='" + this.getId() +  ", nombre='" + this.getName() + ", address='" + this.getAddress() +", email='" + this.getEmail() + '}';
    }

}
