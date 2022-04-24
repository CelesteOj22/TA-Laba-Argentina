package org.Solvd.FastFoodENUMS;

public class Food {
    private Menu menu;
    private PizzaType ptype;
    private HamburguerType htype;
    private FoodStatus status;

    Food(Menu menu,PizzaType ptype,HamburguerType htype,FoodStatus status){
        this.menu=menu;
        this.ptype=ptype;
        this.htype=htype;
        this.status=status;
    }

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
        public String getLabel(){return this.label;}
    }
    enum HamburguerType{
        SIMPLE("Simple"),
        DOUBLECHEESE("Double cheese"),
        VEGAN("Vegan");
        public final String label;
        HamburguerType(String label){
            this.label=label;
        }

    }
    enum FoodStatus{
        ORDERED,
        READY,
        DELIVERED;
    }


}
