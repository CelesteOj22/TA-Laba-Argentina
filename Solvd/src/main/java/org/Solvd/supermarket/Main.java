package org.Solvd.supermarket;

import org.Solvd.supermarket.exceptions.*;
import org.Solvd.supermarket.model.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.*;

public class Main {
    private static final Logger LOGGER =LogManager.getLogger(Main.class);
    public static void main(String[] args){

        //Instantiate 2 employee
        Calendar birthEmployee1= new GregorianCalendar();
        birthEmployee1.set(1992,10,22);
        Calendar birthEmployee2= new GregorianCalendar();
        birthEmployee2.set(1996,12,22);

        Employee employee1= new Employee(1,"Lorenzo Marccini", 29, birthEmployee1, "Morengo St. 345", "99887766","Manager", 600,4);
        Employee employee2= new Employee(2,"Maria Sane", 26, birthEmployee2, "Santa Monica 678", "99389202","Cashier", 400,1);
        Employee employee3= new Employee(3,"Laura Keys", 35, birthEmployee1, "General Main 222", "88954094","Cashier", 500,2);
        ArrayList<Employee> employees = new ArrayList<>();
        Management employeeManagement=new Management(employees);
        employeeManagement.addEmployee(employee1);
        employeeManagement.addEmployee(employee2);

        //Instantiate Supermarket and Branch
        Supermarket wallmart = new Supermarket(22, "Wallmart","Main Road 345","99885533");
        LOGGER.info(wallmart.toString());
        Branch branch1= new Branch(1,"Branch 1","Saint Laurent St.123","11223344","Springfield",employee1,employees);
        LOGGER.info(branch1.toString());


        //Instantiate Customer, Products, Event and Sale
        Bank santander=new Bank(6,"Santander","adress123","santander@gmail.com");
        Customer customer1= new Customer(120,"Maria Lancaster", "Marcus St. 666", "88222993",123123);
        PaymentMethod payment1 = new PaymentMethod(20);
        WireTransfer wireTransfer=new WireTransfer(22,santander,'2');
        PaymentMethod payment2=new PaymentMethod(wireTransfer);

        //Products expiration date
        Calendar expDate1= new GregorianCalendar();
        expDate1.set(2023,06,01);
        Calendar expDate2= new GregorianCalendar();
        expDate2.set(2026,10,01);

        Product rice=new Product(1,"Rice","Minute","Food",25,expDate1);
        Product soap=new Product(2,"Soap","Dove","Bath",30,expDate2);
        Product shampoo=new Product(3,"Shampoo","Dove","Bath",2,expDate2);
        ArrayList<Product> products = new ArrayList<>();
        Management productManagement=new Management(products);
        productManagement.addProducts(rice);
        productManagement.addProducts(soap);


        Calendar eventDate = Calendar.getInstance();
        eventDate.set(2022, Calendar.APRIL, 3);
        Event event1=new Event(eventDate,0.25);

        Sale sale1= new Sale(1,wallmart,branch1,products,payment2,customer1);
        double saleTotal=sale1.total();

        //Trying exceptions

        //Removing a product which is not on the products list, throws exception ProductNotFoundException
        try{
            productManagement.removeProduct(shampoo);
        }catch (ProductNotFoundException e){
            LOGGER.error(e.getMessage());
        }
        //Having only two products, throws exception LessThanThreeProductsException
        try{
            sale1.Discount(event1);
        }catch (LessThanThreeProductsException e){
            LOGGER.error(e.getMessage());
        }

        //Removing an employee who's not on the employees list, throws exception EmployeeNotFoundException
        try{
            employeeManagement.removeEmployee(employee3);
        }catch (EmployeeNotFoundException e){
            LOGGER.error(e.getMessage());
        }

        //Payment without funds
        if (sale1.getPayment().equals(payment2)) {
            try {
                sale1.paymentControl(saleTotal);
            } catch (NotEnoughFundsException e) {
                LOGGER.error(e.getMessage());
                System.out.println(e.getMessage());
            }
        }

        sale1.showReceipt();


    }

}
