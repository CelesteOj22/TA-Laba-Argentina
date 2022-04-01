package org.Solvd.supermarket.model;

public class WireTransfer {
    private int id;
    private Bank bank;

    //Constructors
    public WireTransfer(){}
    public WireTransfer(int id,Bank bank){
        this.setId(id);
        this.setBank(bank);
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setBank(Bank bank){
        this.bank=bank;
    }

    //Getters
    public int getId(){return this.id;}
    public Bank getBank(){return this.bank;}

    @Override
    public String toString(){
        return "WireTransfer{" +"Id='"+this.getId()+ ", bank='" + this.getBank() + '}';
    }
}
