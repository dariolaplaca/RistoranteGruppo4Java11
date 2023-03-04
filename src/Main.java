import java.util.*;

public class Main {
    public static void main(String[] args) {
        // - DESSERTS
        Desserts appleCake = new Desserts("Apple cake" , Set.of("sugar", "vanilla","eggs", "butter", "flour", "yeast", "milk", "apple granny smith" ), "American apple pie", 1.000, 12.0);
        Desserts tiramisu = new Desserts("Tiramisù" , Set.of("mascarpone cheese", "egg yolk", "savoiardi biscuits", "coffee", "cocoa powder"),"Dessert with coffe, biscuits, cocoa", 2.000, 10.0);
        Desserts saltyChocolate = new Desserts("Salty chocolate ice cream" , Set.of("water", "sugar", "milk", "chocolate fondant", "chocolate milk", "cocoa"),"Ice-cream with chocolate fondant and milk chocolate", 500, 25.0);
        Desserts sacherTorte = new Desserts("Sachertorte" , Set.of("chocolate fondant", "cream", "butter", "sugar", "eggs", "flour"),"Dessert with lemon cream", 1.000, 25.0);
        Desserts composeYourDessert = new Desserts("Compose your dessert" , Set.of("Chocolate", "pistachio", "cream", "salty-chocolate ice-cream"),  "Depending on the choice it is possible to make a cake, an ice cream or a mini dessert",500, 25.0);






        //BEVERAGES

        Beverages stillWater = new Beverages("Still Water", "Refreshing and hydrating still water in a one-liter bottle.", 1000, 1.00);
        Beverages sparklingWater = new Beverages("Sparkling Water", "Fizzy and invigorating sparkling water in a one-liter bottle.", 1000, 1.00);
        Beverages cocacola = new Beverages("Coca Cola", "Classic and delicious Coca-Cola in a 33cl bottle.", 330, 2.00);
        Beverages fanta = new Beverages("Fanta", "Fruity and refreshing Fanta in a 33cl bottle.", 330, 2.00);
        Beverages sprite = new Beverages("Sprite", "Lemon-lime flavored and thirst-quenching Sprite in a 33cl bottle.", 330, 2.00);
        Beverages redDraughtBeer = new Beverages("Red Draught Beer", "Rich and flavorful red draught beer served in a 0.4-liter glass.", 400, 4);
        Beverages blondeDraughtBeer = new Beverages("Blonde Draught Beer", "Crisp and refreshing blonde draught beer served in a 0.4-liter glass.", 400, 3.5);
        Beverages redWine = new Beverages("Red Wine", "Smooth and full-bodied red wine served in a 50ml glass.", 50, 5);
        Beverages whiteWine  = new Beverages("White Wine", "Light and refreshing white wine served in a 50ml glass.", 50, 5);
        Beverages Mojito = new Beverages("Mojito", "A classic cocktail made with rum, sugar, lime juice, soda water, and mint leaves. Refreshing and perfect for warm weather.", 130, 7);
        Beverages oldFashioned = new Beverages("Old Fashioned", "A sophisticated cocktail made with whiskey, sugar, bitters, and water or soda. Perfect as an after-dinner drink.", 130, 7);
        Beverages whiskeySour = new Beverages("Whiskey Sour", "A tangy and refreshing cocktail made with whiskey, lemon juice, and sugar. Great for any occasion.", 130, 7);
        Beverages negroni = new Beverages("Negroni", "A complex and bitter cocktail made with gin, vermouth, and Campari. Perfect as an aperitif.", 130, 7);
        Beverages whiteRussian  = new Beverages("White Russian ", "A rich and creamy cocktail made with vodka, coffee liqueur, and cream. Perfect as a dessert drink.", 130, 7);

        //ARRAY LISTS
        ArrayList<Desserts> dessertsList = new ArrayList<Desserts>(Arrays.asList(appleCake,tiramisu,saltyChocolate,sacherTorte,composeYourDessert));

        ArrayList<Beverages> beveragesList = new ArrayList<>(Arrays.asList(
                stillWater, sparklingWater,
                cocacola, fanta, sprite,
                redDraughtBeer, blondeDraughtBeer,
                redWine, whiteWine,
                Mojito, oldFashioned, whiskeySour, negroni, whiteRussian));


        //PRINTING
        printDessert(dessertsList);
        printBeverages(beveragesList);
    }

    //PRINTING FUNCTIONS

    public static void printDessert(ArrayList <Desserts> dessertsList){
        System.out.println("\t\t--------------\n\t\t|\tDESSERTS\t|\n\t\t--------------");
        for(Desserts dessert : dessertsList){
            dessert.printInfo();
            System.out.println();
        }
    }


    public static void printBeverages(ArrayList<Beverages> beveragesList){
        System.out.println("\t\t-----------------\n\t\t|\tBEVERAGES\t|\n\t\t-----------------");
        for(Beverages b : beveragesList){
            b.printInfo();
            System.out.println();
        }
    }
}
