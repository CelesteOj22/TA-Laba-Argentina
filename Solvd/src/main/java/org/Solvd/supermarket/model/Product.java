package org.Solvd.supermarket.model;
import org.Solvd.supermarket.exceptions.LessThanThreeProductsException;

import java.util.*;

public class Product {
    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;
    private Calendar exp; //Expiry Date
    private int stock;
    private Supplier supplier;

    public Product(){
    }
    public Product(int id,String name,String brand,String category,double price,Calendar exp,int stock,Supplier supplier){
        this.setId(id);
        this.setName(name);
        this.setBrand(brand);
        this.setCategory(category);
        this.setPrice(price);
        this.setExp(exp);
        this.setStock(stock);
        this.setSupplier(supplier);
    }
    public Product(int id,String name,String brand,String category,double price,Calendar exp){
        this.setId(id);
        this.setName(name);
        this.setBrand(brand);
        this.setCategory(category);
        this.setPrice(price);
        this.setExp(exp);
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setExp(Calendar exp){
        this.exp=exp;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getCategory(){return this.category;}
    public double getPrice(){
        return this.price;
    }
    public Calendar getExp(){
        return this.exp;
    }
    public int getStock(){
        return this.stock;
    }
    public Supplier getSupplier(){
        return this.supplier;
    }

    //Methods
    public void isItExpired(){
        Calendar currentDate = Calendar.getInstance();
        if (this.getExp().after(currentDate)){
            System.out.println("The product has expired");
        }
        else{
            System.out.println("The product hasn't expired yet");
        }
    }

    public void Discount(double discountP){
        this.setPrice(this.getPrice()-(this.getPrice()*discountP));
    }

    @Override
    public String toString(){
        return "Product{" +"Id='"+this.getId()+ ", name='" + this.getName() + ", brand=" + this.getBrand() +", category=" + this.getCategory() + ", price='" + this.getPrice() + ", expiry date='" + this.getExp() + ", stock='" + this.getStock()  +", supplier='" + this.getSupplier()  + '}';
    }
}
