package org.Solvd.supermarket.model;
import org.Solvd.supermarket.exceptions.*;

import java.util.*;

public class Sale {
    private int id;
    private Supermarket supermarket;
    private Branch branch;
    private PaymentMethod payment;
    private Customer customer;
    private ArrayList<Product> products;

    //Constructors
    public Sale(){}
    public Sale(int id,Supermarket supermarket,Branch branch,ArrayList<Product> products,PaymentMethod payment,Customer customer){
        this.setId(id);
        this.setSupermarket(supermarket);
        this.setBranch(branch);
        this.setProducts(products);
        this.setPayment(payment);
        this.setCustomer(customer);
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setSupermarket(Supermarket supermarket){
        this.supermarket=supermarket;
    }
    public void setBranch(Branch branch){
        this.branch=branch;
    }
    public void setProducts(ArrayList<Product> products){
        this.products=products;
    }
    public void setPayment(PaymentMethod payment){
        this.payment=payment;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }

    //Getters
    public int getId(){return this.id;}
    public Supermarket getSupermarket(){return this.supermarket;}
    public Branch getBranch(){return this.branch;}
    public ArrayList<Product> getProducts(){return this.products;}
    public PaymentMethod getPayment(){return this.payment;}
    public Customer getCustomer(){return this.customer;}


    //Methods
    public double total(){
        double total=0;
        for (Product p : this.getProducts()) {
            total=total+p.getPrice();
        }
        return total;
    }

    //Event: 25% discount on the 3rd product
    public void Discount(Event event) throws LessThanThreeProductsException {
        Calendar currentDate = Calendar.getInstance();

        if (currentDate==event.getDate()){
            this.getProducts().get(2).Discount(event.getDiscount());
        }else{
            throw new LessThanThreeProductsException("A discount on the 3rd product cannot be aply, there's less than 3 products");
        }
    }

    public void paymentControl(double saleTotal) throws NotEnoughFundsException{
        if (this.getPayment().getWireTransfer().getFunds() < saleTotal){
            throw new NotEnoughFundsException("Not enough funds");
        }
    }

    public void showReceipt(){
        Date dateTime = new Date();
        Receipt receipt= new Receipt(this.getSupermarket(),this.getBranch(),dateTime,this.getProducts(),this.total());
        receipt.Print();
    }
    @Override
    public String toString(){
        return "Sale{" + "Id='" + this.getId() +  ", supermarket='" + this.getSupermarket() +   ", branch='" + this.getBranch() +", products='" + this.getProducts() +", payment='" + this.getPayment() +", customer='" + this.getCustomer() + '}';
    }
}
