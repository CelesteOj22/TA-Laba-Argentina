package org.Solvd.supermarket.model;

public class WireTransfer {
    private int id;
    private Bank bank;
    private double funds;

    //Constructors
    public WireTransfer(){}
    public WireTransfer(int id,Bank bank,double funds){
        this.setId(id);
        this.setBank(bank);
        this.setFunds(funds);
    }

    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setBank(Bank bank){
        this.bank=bank;
    }
    public void setFunds(double funds) {this.funds = funds;}

    //Getters
    public int getId(){return this.id;}
    public Bank getBank(){return this.bank;}
    public double getFunds() {return funds;}

    @Override
    public String toString(){
        return "WireTransfer{" +"Id='"+this.getId()+ ", bank='" + this.getBank() +", funds='" + this.getFunds() + '}';
    }
}
