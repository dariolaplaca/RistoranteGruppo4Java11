import java.util.*;

public class Main {
    public static void main(String[] args) {
        // - STARTERS
        Starters ffc = new Starters("Forever Fried Chicken Calamari", Set.of("Chicken", "Calamari"), "Enjoy a classic fried chicken dish with a twist, featuring calamari in a light batter for a unique flavor combination. Perfect for sharing or as an individual meal.", 500, 69.69);
        Starters pineDuck = new Starters("Pineapple Duck Carpaccio", Set.of("Pineapple", "Duck Breast"), "Thinly sliced duck carpaccio served on a bed of fresh pineapple, drizzled with a sweet and tangy balsamic glaze", 400, 3.50);
        Starters typicalHam = new Starters("Typical Vigezzino Ham with Sweet and Sour Skewers", Set.of("Vigezzino Ham", "Honey", "Soy Sauce"), "Marinated Vigezzino ham skewers, grilled to perfection and served with a sweet and sour glaze", 450, 4.00);
        Starters carneSalada = new Starters("Carne Salada with Wheat Flakes and Sour Mushrooms", Set.of("Carne Salada", "Wheat Flakes", "Mushrooms"), "Tender carne salada, served with crunchy wheat flakes, sour mushrooms and a light tomato sauce", 450, 3.50);
        Starters salmon = new Starters("Norwegian Salmon with 5 Cereal Crostini and Flambéed Shrimps with Cognac", Set.of("Norwegian Salmon", "Five Cereal Crostini", "Shrimps", "Cognac"), "Pan-seared Norwegian salmon, served with a medley of five cereal crostini and flambéed shrimps with cognac", 550, 8.00);
        Starters lamb = new Starters("Breaded and Crispy Lamb Bites", Set.of("Lamb", "Bread Crumb"), "Bite-sized pieces of tender lamb, breaded and fried to a golden crisp. Served with a tangy garlic mayo dip", 500, 2.50);
        Starters hamPorcini = new Starters("Typical Vigezzino Ham with Porcini Mushrooms and Walnut Salad", Set.of("Vigezzino Ham", "Porcini Mushroom", "Walnut Salad"), "Thinly sliced Vigezzino ham, served with a robust porcini mushroom and walnut salad", 400, 6.00);

        // - FIRSTS
        Firsts genovese = new Firsts("Genovese", "Traditional Ligurian dish made with slow-cooked onions, served with a fragrant basil pesto sauce and freshly grated Parmesan cheese.", 8.50, 160);
        Firsts carbonara = new Firsts("Carbonara", "A classic Roman pasta dish, featuring spaghetti in a creamy sauce made with eggs, pancetta, and Pecorino Romano cheese.", 9.00, 160);
        Firsts gricia = new Firsts("Gricia", "A simple but flavorful pasta dish from Rome, featuring bucatini pasta in a sauce made with pork jowl, Pecorino Romano cheese, and black pepper.", 10, 120);
        Firsts amatriciana = new Firsts("Amatriciana", "Hearty pasta dish from the town of Amatrice, featuring bucatini pasta in a tangy tomato sauce with cured pork cheek and Pecorino Romano cheese.", 10, 130);
        Firsts orecchiette = new Firsts("Orecchiette broccoli and sausage", "Ear-shaped pasta from Puglia, tossed with tender broccoli florets, savory sausage, garlic, and olive oil.", 8, 120);
        Firsts tagliatelle = new Firsts("Tagliatelle with white meat sauce", "Ribbon-shaped pasta in a rich and creamy sauce made with tender white meat, Parmesan cheese, and a hint of nutmeg.", 7, 150);

        // - SECONDS
        Seconds florentine = new Seconds("Rare Florentine", "Tender and juicy classic steak with a delicious char on the outside, served with roasted vegetables and crispy potatoes.", 20, 1000);
        Seconds wagyu = new Seconds("Wagyu", "Luxurious premium cut cooked to perfection, served with creamy mashed potatoes and steamed green beans.", 30, 400);
        Seconds kangarooSausage = new Seconds("Kangaroo Sausage", "Unique and flavorful sausage made with lean, tender kangaroo meat, served with sauerkraut and homemade mustard.", 25, 750);
        Seconds meatRolls = new Seconds("Meat Rolls", "Hearty and delicious appetizer with seasoned ground beef wrapped in crispy pastry, served with tomato dipping sauce.", 15, 300);
        Seconds beefTartare = new Seconds("Beef Tartare", "Indulgent dish made with fresh high-quality beef, seasoned to perfection and served with toasted bread and mixed greens.", 24, 300);
        Seconds hamburger = new Seconds("Hamburger", "Classic 100% beef burger with traditional toppings, satisfying and affordable.", 12, 220);

        // - DESSERTS
        Desserts appleCake = new Desserts("Apple cake", Set.of("sugar", "vanilla", "eggs", "butter", "flour", "yeast", "milk", "apple granny smith"), "American apple pie", 1.000, 12.0);
        Desserts tiramisu = new Desserts("Tiramisù", Set.of("mascarpone cheese", "egg yolk", "savoiardi biscuits", "coffee", "cocoa powder"), "Dessert with coffe, biscuits, cocoa", 2.000, 10.0);
        Desserts saltyChocolate = new Desserts("Salty chocolate ice cream", Set.of("water", "sugar", "milk", "chocolate fondant", "chocolate milk", "cocoa"), "Ice-cream with chocolate fondant and milk chocolate", 500, 25.0);
        Desserts sacherTorte = new Desserts("Sachertorte", Set.of("chocolate fondant", "cream", "butter", "sugar", "eggs", "flour"), "Dessert with lemon cream", 1.000, 25.0);
        Desserts composeYourDessert = new Desserts("Compose your dessert", Set.of("Chocolate", "pistachio", "cream", "salty-chocolate ice-cream"), "Depending on the choice it is possible to make a cake, an ice cream or a mini dessert", 500, 25.0);

        // - BEVERAGES
        Beverages stillWater = new Beverages("Still Water", "Refreshing and hydrating still water in a one-liter bottle.", 1000, 1.00);
        Beverages sparklingWater = new Beverages("Sparkling Water", "Fizzy and invigorating sparkling water in a one-liter bottle.", 1000, 1.00);
        Beverages cocacola = new Beverages("Coca Cola", "Classic and delicious Coca-Cola in a 33cl bottle.", 330, 2.00);
        Beverages fanta = new Beverages("Fanta", "Fruity and refreshing Fanta in a 33cl bottle.", 330, 2.00);
        Beverages sprite = new Beverages("Sprite", "Lemon-lime flavored and thirst-quenching Sprite in a 33cl bottle.", 330, 2.00);
        Beverages redDraughtBeer = new Beverages("Red Draught Beer", "Rich and flavorful red draught beer served in a 0.4-liter glass.", 400, 4);
        Beverages blondeDraughtBeer = new Beverages("Blonde Draught Beer", "Crisp and refreshing blonde draught beer served in a 0.4-liter glass.", 400, 3.5);
        Beverages redWine = new Beverages("Red Wine", "Smooth and full-bodied red wine served in a 50ml glass.", 50, 5);
        Beverages whiteWine = new Beverages("White Wine", "Light and refreshing white wine served in a 50ml glass.", 50, 5);
        Beverages Mojito = new Beverages("Mojito", "A classic cocktail made with rum, sugar, lime juice, soda water, and mint leaves. Refreshing and perfect for warm weather.", 130, 7);
        Beverages oldFashioned = new Beverages("Old Fashioned", "A sophisticated cocktail made with whiskey, sugar, bitters, and water or soda. Perfect as an after-dinner drink.", 130, 7);
        Beverages whiskeySour = new Beverages("Whiskey Sour", "A tangy and refreshing cocktail made with whiskey, lemon juice, and sugar. Great for any occasion.", 130, 7);
        Beverages negroni = new Beverages("Negroni", "A complex and bitter cocktail made with gin, vermouth, and Campari. Perfect as an aperitif.", 130, 7);
        Beverages whiteRussian = new Beverages("White Russian ", "A rich and creamy cocktail made with vodka, coffee liqueur, and cream. Perfect as a dessert drink.", 130, 7);

        //MENU
        Menu menu = new Menu();
        //TODO Cambiare tutti i set in addAll
        menu.addAllBeverage(Arrays.asList(
                stillWater, sparklingWater,
                cocacola, fanta, sprite,
                redDraughtBeer, blondeDraughtBeer,
                redWine, whiteWine,
                Mojito, oldFashioned, whiskeySour, negroni, whiteRussian));
        menu.addAllStarters(Arrays.asList(ffc, pineDuck, typicalHam, carneSalada, salmon, lamb, hamPorcini));
        menu.setFirstsList(Arrays.asList(genovese, carbonara, gricia, amatriciana, orecchiette, tagliatelle));
        menu.setSecondsList(Arrays.asList(florentine, wagyu, kangarooSausage, meatRolls, beefTartare, hamburger));
        menu.addAllDessert(Arrays.asList(appleCake, tiramisu, saltyChocolate, sacherTorte, composeYourDessert));

        menu.printMenu();
    }
}
