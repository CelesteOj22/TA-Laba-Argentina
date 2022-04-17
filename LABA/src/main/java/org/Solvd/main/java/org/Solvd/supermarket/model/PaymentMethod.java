package org.Solvd.supermarket.model;

public class PaymentMethod {
    private double cash;
    private CreditCard creditCard;
    private WireTransfer wireTransfer;

    //Constructors
    public PaymentMethod(){}
    public PaymentMethod(double cash){
        this.setCash(cash);
    }
    public PaymentMethod(CreditCard creditCard){
        this.setCreditCard(creditCard);
    }
    public PaymentMethod(WireTransfer wireTransfer){this.setWireTransfer(wireTransfer);}

    //Setters
    public void setCash(double cash){
        this.cash=cash;
    }
    public void setCreditCard(CreditCard creditCard){this.creditCard=creditCard;}
    public void setWireTransfer(WireTransfer wireTransfer){this.wireTransfer=wireTransfer;}

    //Getters
    public double getCash(){return this.cash;}
    public CreditCard getCreditCard(){return this.creditCard;}
    public WireTransfer getWireTransfer(){return this.wireTransfer;}

    //Methods
    @Override
    public String toString() {
        return "PaymentMethod{" +"cash='"+this.getCash()+ ", credit card='" + this.getCreditCard() + ", wire transfer=" + this.getWireTransfer() + '}';
    }
}
