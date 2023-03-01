
public class Main {
    public static void main(String[] args) {
        // - DESSERTS
        Desserts appleCake = new Desserts("Apple cake  " , "sugar, vanilla, eggs, butter, flour, yeast, milk, apple granny smith" , " American apple pie with", 1.000, 12.0);
        Desserts tiramisù = new Desserts("Tiramisù  " , "mascarpone cheese, egg yolk, savoiardi biscuits, coffee, cocoa powder"," - Dessert with coffe, biscuits, cocoa", 2.000, 10.0);
        Desserts saltyChocolate = new Desserts("Salty chocolate ice cream  " , "water, sugar, milk, chocolate fondant, chocolate milk, cocoa"," - Ice-cream with chocolate fondant and milk chocolate", 500, 25.0);
        Desserts sacherTorte = new Desserts("Sachertorte  " , "chocolate fondant, cream, butter, sugar, eggs, flour "," - Dessert with lemon cream", 1.000, 25.0);
        Desserts composeYourDessert = new Desserts("Compose your dessert  " ,"available ingredients : Chocolate, pistachio, cream, salty-chocolate ice-cream ",  "depending on the choice it is possible to make a cake, an ice cream or a mini dessert",500, 25.0);

        System.out.print("1) ");
        appleCake.printInfo();

        System.out.println();

        System.out.print("2)");
        tiramisù.printInfo();
        System.out.println();

        System.out.print("3)");
        saltyChocolate.printInfo();
        System.out.println();

        System.out.print("4)");
        sacherTorte.printInfo();
        System.out.println();

        System.out.print("5)");
        composeYourDessert.printInfo();
        System.out.println();

    }
}
