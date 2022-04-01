package org.Solvd.supermarket;

import org.Solvd.supermarket.model.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.*;

public class Main {
    private static final Logger LOGGER =LogManager.getLogger(Main.class);
    public static void main(String[] args){
        Calendar birthEmployee1= new GregorianCalendar();
        birthEmployee1.set(1992,10,22);
        Calendar birthEmployee2= new GregorianCalendar();
        birthEmployee2.set(1996,12,22);

        Calendar expDate1= new GregorianCalendar();
        expDate1.set(2023,06,01);
        Calendar expDate2= new GregorianCalendar();
        expDate2.set(2026,10,01);

        Product rice=new Product(1,"Rice","Minute","Food",4,expDate1);
        Product soap=new Product(1,"Soap","Dove","Bath",2,expDate2);
        ArrayList<Product> products = new ArrayList<>();
        products.add(rice);
        products.add(soap);

        Supermarket wallmart = new Supermarket(22, "Wallmart","Main Road 345","99885533");
        LOGGER.info(wallmart.toString());
        
        Employee employee1= new Employee(1,"Lorenzo Marccini", 29, birthEmployee1, "Morengo St. 345", "99887766","Manager", 600,4);
        Employee employee2= new Employee(2,"Maria Sane", 26, birthEmployee2, "Morengo St. 345", "99887766","Cashier", 500,2);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);


        Branch branch1= new Branch(1,"Branch 1","Saint Laurent St.123","11223344","Springfield",employee1,employees);
        LOGGER.info(branch1.toString());
        PaymentMethod payment1 = new PaymentMethod(20);
        Customer customer1= new Customer(120,"Maria Lancaster", "Marcus St. 666", "88222993",123123);



        Sale sale1= new Sale(1,wallmart,branch1,products,payment1,customer1);
        sale1.showReceipt();

    }
}
