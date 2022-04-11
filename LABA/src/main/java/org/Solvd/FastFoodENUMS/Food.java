package org.Solvd.FastFoodENUMS;

public class Food {
    private Menu menu;
    private PizzaType ptype;
    private FoodStatus status;

    Food(Menu menu,PizzaType ptype,FoodStatus status,String value){
        this.menu=menu;
        this.ptype=ptype;
        this.status=status;

    }
    public Menu getMenu(){return menu;}
    public PizzaType getPizzaType(){return this.ptype;}
    public FoodStatus getStatus(){return this.status;}

    enum Menu{
        PIZZA,
        FRIES,
        HAMBURGUER;
    }
    enum PizzaType{
        SIMPLE("Simple"),
        PEPPERONI("Pepperoni"),
        VEGAN("Vegan");
        public final String label;
        PizzaType(String label){
            this.label=label;
        }
    }
    enum FoodStatus{
        ORDERED,
        READY,
        DELIVERED;
    }


}
