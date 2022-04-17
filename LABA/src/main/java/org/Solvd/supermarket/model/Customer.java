package org.Solvd.supermarket.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Customer extends Person{
    private int customerCode;
    private PaymentMethod pay;

    private static final Logger LOGGER = LogManager.getLogger(Customer.class);

    //Constructors
    public Customer(){}
    public Customer(int id, String name, String address, String phoneNumber, int customerCode,PaymentMethod pay){
        super(id,name,address,phoneNumber);
        this.setCodeClient(customerCode);
        this.setPay(pay);
    }

    //Setters
    public void setCodeClient(int customerCode){
        this.customerCode=customerCode;
    }
    public void setPay(PaymentMethod pay){this.pay=pay;}

    //Gettters
    public int getCustomerCode(){return this.customerCode;}
    public PaymentMethod getPay(){return this.pay;}

    //Method
    //public void paymentMethod(IBuy payment) {
    //    LOGGER.info("Payment Method: " + payment);
    //}
    @Override
    public String toString() {
        return "Person{" +"Id='"+this.getId()+ ", name='" + this.getName() + ", age=" + this.getAge() + ", date of birth='" + this.getBirth() + ", address='" + this.getAddress() + ", phone number='" + this.getPhoneNumber()  + ", customer code='" + this.getCustomerCode()  + ", payment method='" +this.getPay()  + '}';
    }
}
