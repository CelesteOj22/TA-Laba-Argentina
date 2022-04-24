package org.Solvd.FastFoodENUMS;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args){
        Scanner ans=new Scanner(System.in);
        System.out.println("MENU: ");
        for (Food.Menu items : Food.Menu.values()) {
            System.out.println(items);
        }
        System.out.println("Choose your order: ");
        String answer=ans.nextLine();
        String order=answer.toUpperCase();
        switch (order) {
            case "PIZZA" -> {
                for (Food.PizzaType types : Food.PizzaType.values()) {
                    System.out.println(types.getLabel());
                }
                System.out.println("Choose your type: ");
                String Ptype = ans.nextLine();
                Status(Ptype + " pizza");
                LOGGER.info(Ptype + " pizza delivered");
            }
            case "FRIES" -> Status("fries");
            case "HAMBURGUER" -> {
                for (Food.HamburguerType types : Food.HamburguerType.values()) {
                    System.out.println(types.label);
                }
                System.out.println("Choose your type: ");
                String Htype = ans.nextLine();
                Status(Htype + " hamburguer");
                LOGGER.info(Htype + " hamburguer delivered");
            }
            default -> System.out.println("Your input is not on the menu");
        }
        }

    public static void Status(String answer){
        System.out.println("Your "+answer+" status is:");
        for (Food.FoodStatus status : Food.FoodStatus.values()) {
            switch (status) {
                case ORDERED -> {
                    System.out.println("We are taking your order...");
                    wait(4);
                    System.out.println(status);
                }
                case READY -> {
                    System.out.println("We are getting your order ready...");
                    wait(6);
                    System.out.println(status);
                }
                case DELIVERED -> {
                    System.out.println("We are delivering your order...");
                    wait(8);
                    System.out.println(status);
                }
            }
        }
    }
    public static void wait(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
