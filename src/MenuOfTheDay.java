import java.util.*;

public class MenuOfTheDay {

    public static void generateMenu() {
        Course ffc = new Starters("Forever Fried Chicken Calamari", Set.of(Allergens.SHELLFISH), "Enjoy a classic fried chicken dish with a twist, featuring calamari in a light batter for a unique flavor combination. Perfect for sharing or as an individual meal.", 500, 69.69);
        Course pineDuck = new Starters("Pineapple Duck Carpaccio", "Thinly sliced duck carpaccio served on a bed of fresh pineapple, drizzled with a sweet and tangy balsamic glaze", 400, 3.50);
        Course typicalHam = new Starters("Typical Vigezzino Ham with Sweet and Sour Skewers", Set.of(Allergens.SOY), "Marinated Vigezzino ham skewers, grilled to perfection and served with a sweet and sour glaze", 450, 4.00);
        Course carneSalada = new Starters("Carne Salada with Wheat Flakes and Sour Mushrooms", Set.of(Allergens.CEREALS_CONTAINING_GLUTEN), "Tender carne salada, served with crunchy wheat flakes, sour mushrooms and a light tomato sauce", 450, 3.50);
        Course salmon = new Starters("Norwegian Salmon with 5 Cereal Crostini and Flambéed Shrimps with Cognac", Set.of(Allergens.FISH,Allergens.SHELLFISH,Allergens.CEREALS_CONTAINING_GLUTEN), "Pan-seared Norwegian salmon, served with a medley of five cereal crostini and flambéed shrimps with cognac", 550, 8.00);
        Course lamb = new Starters("Breaded and Crispy Lamb Bites", Set.of(Allergens.CEREALS_CONTAINING_GLUTEN), "Bite-sized pieces of tender lamb, breaded and fried to a golden crisp. Served with a tangy garlic mayo dip", 500, 2.50);
        Course hamPorcini = new Starters("Typical Vigezzino Ham with Porcini Mushrooms and Walnut Salad", Set.of(Allergens.NUTS), "Thinly sliced Vigezzino ham, served with a robust porcini mushroom and walnut salad", 400, 6.00);

        // - FIRSTS
        Course genovese = new Firsts("Genovese", "Traditional Ligurian dish made with slow-cooked onions, served with a fragrant basil pesto sauce and freshly grated Parmesan cheese.", 8.50, 160);
        Course carbonara = new Firsts("Carbonara", "A classic Roman pasta dish, featuring spaghetti in a creamy sauce made with eggs, pancetta, and Pecorino Romano cheese.", 9.00, 160);
        Course gricia = new Firsts("Gricia", "A simple but flavorful pasta dish from Rome, featuring bucatini pasta in a sauce made with pork jowl, Pecorino Romano cheese, and black pepper.", 10, 120);
        Course amatriciana = new Firsts("Amatriciana", "Hearty pasta dish from the town of Amatrice, featuring bucatini pasta in a tangy tomato sauce with cured pork cheek and Pecorino Romano cheese.", 10, 130);
        Course orecchiette = new Firsts("Orecchiette broccoli and sausage", "Ear-shaped pasta from Puglia, tossed with tender broccoli florets, savory sausage, garlic, and olive oil.", 8, 120);
        Course tagliatelle = new Firsts("Tagliatelle with white meat sauce", "Ribbon-shaped pasta in a rich and creamy sauce made with tender white meat, Parmesan cheese, and a hint of nutmeg.", 7, 150);

        // - SECONDS
        Course florentine = new Seconds("Rare Florentine", "Tender and juicy classic steak with a delicious char on the outside, served with roasted vegetables and crispy potatoes.", 20, 1000);
        Course wagyu = new Seconds("Wagyu", "Luxurious premium cut cooked to perfection, served with creamy mashed potatoes and steamed green beans.", 30, 400);
        Course kangarooSausage = new Seconds("Kangaroo Sausage", "Unique and flavorful sausage made with lean, tender kangaroo meat, served with sauerkraut and homemade mustard.", 25, 750);
        Course meatRolls = new Seconds("Meat Rolls", "Hearty and delicious appetizer with seasoned ground beef wrapped in crispy pastry, served with tomato dipping sauce.", 15, 300);
        Course beefTartare = new Seconds("Beef Tartare", "Indulgent dish made with fresh high-quality beef, seasoned to perfection and served with toasted bread and mixed greens.", 24, 300);
        Course hamburger = new Seconds("Hamburger", "Classic 100% beef burger with traditional toppings, satisfying and affordable.", 12, 220);

        // - DESSERTS
        Course appleCake = new Desserts("Apple cake", Set.of("sugar", "vanilla", "eggs", "butter", "flour", "yeast", "milk", "apple granny smith"), "American apple pie", 1.000, 12.0);
        Course tiramisu = new Desserts("Tiramisù", Set.of("mascarpone cheese", "egg yolk", "savoiardi biscuits", "coffee", "cocoa powder"), "Dessert with coffe, biscuits, cocoa", 2.000, 10.0);
        Course saltyChocolate = new Desserts("Salty chocolate ice cream", Set.of("water", "sugar", "milk", "chocolate fondant", "chocolate milk", "cocoa"), "Ice-cream with chocolate fondant and milk chocolate", 500, 25.0);
        Course sacherTorte = new Desserts("Sachertorte", Set.of("chocolate fondant", "cream", "butter", "sugar", "eggs", "flour"), "Dessert with lemon cream", 1.000, 25.0);
        Course composeYourDessert = new Desserts("Compose your dessert", Set.of("Chocolate", "pistachio", "cream", "salty-chocolate ice-cream"), "Depending on the choice it is possible to make a cake, an ice cream or a mini dessert", 500, 25.0);

        // - BEVERAGES
        Course stillWater = new Beverages("Still Water", "Refreshing and hydrating still water in a one-liter bottle.", 1000, 1.00);
        Course sparklingWater = new Beverages("Sparkling Water", "Fizzy and invigorating sparkling water in a one-liter bottle.", 1000, 1.00);
        Course cocacola = new Beverages("Coca Cola", "Classic and delicious Coca-Cola in a 33cl bottle.", 330, 2.00);
        Course fanta = new Beverages("Fanta", "Fruity and refreshing Fanta in a 33cl bottle.", 330, 2.00);
        Course sprite = new Beverages("Sprite", "Lemon-lime flavored and thirst-quenching Sprite in a 33cl bottle.", 330, 2.00);
        Course redDraughtBeer = new Beverages("Red Draught Beer", "Rich and flavorful red draught beer served in a 0.4-liter glass.", 400, 4);
        Course blondeDraughtBeer = new Beverages("Blonde Draught Beer", "Crisp and refreshing blonde draught beer served in a 0.4-liter glass.", 400, 3.5);
        Course redWine = new Beverages("Red Wine", "Smooth and full-bodied red wine served in a 50ml glass.", 50, 5);
        Course whiteWine = new Beverages("White Wine", "Light and refreshing white wine served in a 50ml glass.", 50, 5);
        Course Mojito = new Beverages("Mojito", "A classic cocktail made with rum, sugar, lime juice, soda water, and mint leaves. Refreshing and perfect for warm weather.", 130, 7);
        Course oldFashioned = new Beverages("Old Fashioned", "A sophisticated cocktail made with whiskey, sugar, bitters, and water or soda. Perfect as an after-dinner drink.", 130, 7);
        Course whiskeySour = new Beverages("Whiskey Sour", "A tangy and refreshing cocktail made with whiskey, lemon juice, and sugar. Great for any occasion.", 130, 7);
        Course negroni = new Beverages("Negroni", "A complex and bitter cocktail made with gin, vermouth, and Campari. Perfect as an aperitif.", 130, 7);
        Course whiteRussian = new Beverages("White Russian ", "A rich and creamy cocktail made with vodka, coffee liqueur, and cream. Perfect as a dessert drink.", 130, 7);

        List<Course> beverageList = Arrays.asList(stillWater, sparklingWater, cocacola, fanta, sprite, redDraughtBeer, blondeDraughtBeer, redWine, whiteWine, Mojito, oldFashioned, whiskeySour, negroni, whiteRussian);
        List<Course> startersList = Arrays.asList(ffc, pineDuck, typicalHam, carneSalada, salmon, lamb, hamPorcini);
        List<Course> firstsList = Arrays.asList(genovese, carbonara, gricia, amatriciana, orecchiette, tagliatelle);
        List<Course> secondsList = Arrays.asList(florentine, wagyu, kangarooSausage, meatRolls, beefTartare, hamburger);
        List<Course> dessertsList = Arrays.asList(appleCake, tiramisu, saltyChocolate, sacherTorte, composeYourDessert);

        Random random = new Random();

        Course selectedBeverage = beverageList.get(random.nextInt(beverageList.size()));
        Course selectedStarter = startersList.get(random.nextInt(startersList.size()));
        Course selectedFirst = firstsList.get(random.nextInt(firstsList.size()));
        Course selectedSecond = secondsList.get(random.nextInt(secondsList.size()));
        Course selectedDessert = dessertsList.get(random.nextInt(dessertsList.size()));

        System.out.println("Selected Dishes:");
        System.out.println("Appetizer: " + selectedStarter.getName() + ": " + selectedStarter.getPrice());
        System.out.println("Entree: " + selectedFirst.getName() + ": " + selectedFirst.getPrice());
        System.out.println("Main course: " + selectedSecond.getName() + ": " + selectedSecond.getPrice());
        System.out.println("Dessert: " + selectedDessert.getName() + ": " + selectedDessert.getPrice());
        System.out.println("Beverage: " + selectedBeverage.getName() + ": " + selectedBeverage.getPrice());

        double totalCost = selectedBeverage.getPrice() + selectedStarter.getPrice() + selectedFirst.getPrice() + selectedSecond.getPrice() + selectedDessert.getPrice();
        System.out.println("Total cost: " + totalCost);
    }

}
