package org.Solvd.supermarket.model;
public class Customer extends Person{
    private int customerCode;

    //Constructors
    public Customer(){}
    public Customer(int id, String name, String address, String phoneNumber, int customerCode){
        super(id,name,address,phoneNumber);
        this.setCodeClient(customerCode);
    }

    //Setters
    public void setCodeClient(int customerCode){
        this.customerCode=customerCode;
    }

    //Gettters
    public int getCustomerCode(){return this.customerCode;}

    //Method
    @Override
    public String toString() {
        return "Person{" +"Id='"+this.getId()+ ", name='" + this.getName() + ", age=" + this.getAge() + ", date of birth='" + this.getBirth() + ", address='" + this.getAddress() + ", phone number='" + this.getPhoneNumber()  + ", customer code='" + this.getCustomerCode()  + '}';
    }
}
