package org.Solvd.supermarket.model;
import org.Solvd.supermarket.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Receipt {
    private static final Logger LOGGER = LogManager.getLogger(Receipt.class);
    private Supermarket supermarket;
    private Branch branch;
    private Date dateTime;
    private ArrayList<Product> products;
    private double total;

    //Constructors
    public Receipt(){}
    public Receipt(Supermarket supermarket,Branch branch,Date dateTime,ArrayList<Product> products,double total){
        this.setSupermarket(supermarket);
        this.setBranch(branch);
        this.setDateTime(dateTime);
        this.setProducts(products);
        this.setTotal(total);
    }

    //Setters
    public void setSupermarket(Supermarket supermarket){
        this.supermarket=supermarket;
    }
    public void setBranch(Branch branch){
        this.branch=branch;
    }
    public void setDateTime(Date dateTime){
        this.dateTime=dateTime;
    }
    public void setProducts(ArrayList<Product> products){
        this.products=products;
    }
    public void setTotal(double total){
        this.total=total;
    }

    //Getters
    public Supermarket getSupermarket(){return this.supermarket;}
    public Branch getBranch(){return this.branch;}
    public Date getDateTime(){return this.dateTime;}
    public ArrayList<Product> getProducts() {return this.products;}
    public double getTotal(){return this.total;}

    //Methods
    public void Print(){
        LOGGER.info(this.supermarket.getName()+ "\n"+ this.branch.getName()+ "\n" +this.branch.getAddress()+"\n" +this.branch.getPhoneNumber()+"\n" +this.getDateTime()+"\n\n" +"-------------------------------------------");
        for (Product p : products) {
            LOGGER.info(p.getName()+"\t"+p.getBrand()+"\t\t $"+p.getPrice());
        }
        LOGGER.info("-------------------------------------------\nTOTAL\t\t\t\t$"+this.getTotal());
    }

    @Override
    public String toString() {
        return "Receipt{" +"supermarket='"+this.getSupermarket()+"branch='"+this.getBranch()+ ", datetime='" + this.getDateTime() + ", products=" + this.getProducts() + ", total='" + this.getTotal() + '}';
    }
}
