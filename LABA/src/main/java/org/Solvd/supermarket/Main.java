package org.Solvd.supermarket;

import org.Solvd.supermarket.exceptions.*;
import org.Solvd.supermarket.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args){

        //Setting the employees date of birth - using Calendar instead of Date
        Calendar birthEmployee1= new GregorianCalendar();
        birthEmployee1.set(1992,Calendar.OCTOBER,22);
        Calendar birthEmployee2= new GregorianCalendar();
        birthEmployee2.set(1996,Calendar.DECEMBER,22);

        Employee employee1= new Employee(1,"Lorenzo Marccini", 29, birthEmployee1, "Morengo St. 345", "99887766","Manager", 600,4);
        Employee employee2= new Employee(2,"Maria Sane", 26, birthEmployee2, "Santa Monica 678", "99389202","Cashier", 400,1);
        Employee employee3= new Employee(3,"Laura Keys", 35, birthEmployee1, "General Main 222", "88954094","Cashier", 500,2);
        ArrayList<Employee> employees = new ArrayList<>();
        Management<Employee> employeeList=new Management<>(employees);
        employeeList.add(employee1);
        employeeList.add(employee2);

        //Using streams to apply a filter to the employees list
        List<Employee> result = employees.stream().filter(s->s.getName().startsWith("L")).collect(Collectors.toList());
        System.out.println(result);
        //employees.forEach(System.out::println);


        //Instantiate Supermarket and Branch
        Supermarket wallmart = new Supermarket(22, "Wallmart","Main Road 345","99885533");
        LOGGER.info(wallmart.toString());
        Branch branch1= new Branch(1,"Branch 1","Saint Laurent St.123","11223344","Springfield",employee1,employees);
        LOGGER.info(branch1.toString());


        //Instantiate Bank, Payment methods and Customers
        Bank santander=new Bank(6,"Santander","address123","santander@gmail.com");
        PaymentMethod payment1 = new PaymentMethod(20);
        WireTransfer wireTransfer=new WireTransfer(22,santander,'2');
        PaymentMethod payment2=new PaymentMethod(wireTransfer);

        Customer customer1= new Customer(120,"Maria Lancaster", "Marcus St. 666", "88222993",123123,payment1);
        Customer customer2= new Customer(300,"Josh Lane", "Morengo St. 666", "99109290",666666,payment2);

        //Applying lambda expressions
        IPay customer = (payment) -> LOGGER.info("Payment Method: Cash");
        customer.paymentMethod(payment1);


        //Products expiration date
        Calendar expDate1= new GregorianCalendar();
        expDate1.set(2023,Calendar.JUNE,1);
        Calendar expDate2= new GregorianCalendar();
        expDate2.set(2026,Calendar.OCTOBER,1);

        Supplier shampooSupplier= new Supplier(1,"Tropical Labs","address 123","392021019","tropicalLabs@gmail.com");
        ISupply supplier = (text) -> System.out.println(text+" supplier");
        shampooSupplier.supply(supplier,"shampoo");

        Product rice=new Product(1,"Rice","Minute","Food",25,expDate1);
        Product soap=new Product(2,"Soap","Dove","Bath",30,expDate2);
        Product shampoo=new Product(3,"Shampoo","Dove","Bath",2,expDate2,20,shampooSupplier);
        ArrayList<Product> products = new ArrayList<>();
        Management<Product> productList=new Management<>(products);
        productList.add(rice);
        productList.add(soap);


        Calendar eventDate = Calendar.getInstance();
        eventDate.set(2022, Calendar.APRIL, 3);
        Event event1=new Event(eventDate,0.25);

        Sale sale1= new Sale(1,wallmart,branch1,customer1,products);
        ArrayList<Sale> sales = new ArrayList<>();
        Management<Sale> saleList=new Management<>(sales);
        saleList.add(sale1);

        //Trying exceptions

        //Removing a product who's not on the products list, throws exception ProductNotFoundException
        try{
            productList.removeProduct(shampoo,sale1);
        }catch (ProductNotFoundException e){
            LOGGER.error(e.getMessage());
        }

        //Apply discount to the 3rd product but only having two products, throws exception LessThanThreeProductsException
        try{
            sale1.Discount(event1);
        }catch (LessThanThreeProductsException e){
            LOGGER.error(e.getMessage());
        }

        //Removing an employee who's not on the employees list, throws exception EmployeeNotFoundException
        try{
            employeeList.removeEmployee(employee3);
        }catch (EmployeeNotFoundException e){
            LOGGER.error(e.getMessage());
        }

        //Payment without funds
        if (sale1.getCustomer().getPay().equals(payment2)) {
            try {
                sale1.paymentControl(sale1.getTotal());
            } catch (NotEnoughFundsException e) {
                LOGGER.error(e.getMessage());
                LOGGER.info(e.getMessage());
            }
        }

        sale1.showReceipt();

    }

}
