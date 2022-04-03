package org.Solvd.supermarket.model;
import java.util.*;

public class Event {
    private Calendar date;
    private double discount;

    //Constructor
    public Event(){}
    public Event(Calendar date,double discount){
        this.setDate(date);
        this.setDiscount(discount);
    }


    //Setters
    public void setDate(Calendar date){
        this.date=date;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }

    //Getters
    public Calendar getDate(){return this.date;}
    public double getDiscount(){return this.discount;}

    //Method

    @Override
    public String toString(){
        return "Event{" + "date='" + this.getDate() +  ", discount='" + this.getDiscount() +'}';
    }
}
