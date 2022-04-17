package org.Solvd.supermarket.model;
import org.Solvd.supermarket.exceptions.*;

import java.util.*;

public class Sale{
    private int id;
    private Supermarket supermarket;
    private Branch branch;
    private Customer customer;
    private ArrayList<Product> products;
    private double total=0;

    //Constructors
    public Sale(){}
    public Sale(int id,Supermarket supermarket,Branch branch,Customer customer,ArrayList<Product> products){
        this.setId(id);
        this.setSupermarket(supermarket);
        this.setBranch(branch);
        this.setCustomer(customer);
        this.setProducts(products);
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
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void setTotal(Double total){this.total=total;}

    //Getters
    public int getId(){return this.id;}
    public Supermarket getSupermarket(){return this.supermarket;}
    public Branch getBranch(){return this.branch;}
    public ArrayList<Product> getProducts(){return this.products;}
    public Customer getCustomer(){return this.customer;}
    public Double getTotal(){return this.total;}


    //Methods
    public void total(){
        Iterator<Product> it = this.getProducts().iterator();
        while (it.hasNext()){
            Addable add=(a,b)->(a+b);
            this.setTotal(add.add(this.getTotal(),it.next().getPrice()));
        }
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
        if (this.getCustomer().getPay().getWireTransfer().getFunds() < saleTotal){
            throw new NotEnoughFundsException("Not enough funds");
        }
    }

    public void showReceipt(){
        Date dateTime = new Date();
        this.total();
        IPrint receipt= () -> {
            System.out.println(this.supermarket.getName()+ "\n"+ this.branch.getName()+ "\n" +this.branch.getAddress()+"\n" +this.branch.getPhoneNumber()+"\n" +dateTime+"\n\n" +"-------------------------------------------");
            this.getProducts().forEach((Product p)-> {System.out.println(p.getName()+"\t"+p.getBrand()+"\t\t $"+p.getPrice());});
            System.out.println("-------------------------------------------\nTOTAL\t\t\t\t$"+this.getTotal());
        };
        receipt.print();
    }
    @Override
    public String toString(){
        return "Sale{" + "Id='" + this.getId() +  ", supermarket='" + this.getSupermarket() +   ", branch='" + this.getBranch() +", products='" + this.getProducts() +", payment='" + this.getCustomer().getPay() +", customer='" + this.getCustomer() + '}';
    }
}
