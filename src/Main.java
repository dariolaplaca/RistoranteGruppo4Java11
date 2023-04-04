import java.util.*;

public class Main {
    public static void main(String[] args) {
        // - STARTERS
        Course ffc = new Starters("Forever Fried Chicken Calamari", "Enjoy a classic fried chicken dish with a twist, featuring calamari in a light batter for a unique flavor combination. Perfect for sharing or as an individual meal.", 500, 400, 69.69, MenuType.FISH_MENU, Set.of(AllergensEnum.SHELLFISH));
        Course pineDuck = new Starters("Pineapple Duck Carpaccio", "Thinly sliced duck carpaccio served on a bed of fresh pineapple, drizzled with a sweet and tangy balsamic glaze", 400, 200, 3.50, MenuType.MENU, Set.of(AllergensEnum.NONE));
        Course typicalHam = new Starters("Typical Vigezzino Ham with Sweet and Sour Skewers", "Marinated Vigezzino ham skewers, grilled to perfection and served with a sweet and sour glaze", 450, 800, 4.00, MenuType.MENU, Set.of(AllergensEnum.SOY));
        Course carneSalada = new Starters("Carne Salada with Wheat Flakes and Sour Mushrooms", "Tender carne salada, served with crunchy wheat flakes, sour mushrooms and a light tomato sauce", 450, 120, 3.50, MenuType.MEAT_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course salmon = new Starters("Norwegian Salmon with 5 Cereal Crostini and Flambéed Shrimps with Cognac", "Pan-seared Norwegian salmon, served with a medley of five cereal crostini and flambéed shrimps with cognac", 550, 200, 8.00, MenuType.FISH_MENU, Set.of(AllergensEnum.FISH, AllergensEnum.SHELLFISH, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course lamb = new Starters("Breaded and Crispy Lamb Bites", "Bite-sized pieces of tender lamb, breaded and fried to a golden crisp. Served with a tangy garlic mayo dip", 500, 440, 2.50, MenuType.MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course hamPorcini = new Starters("Typical Vigezzino Ham with Porcini Mushrooms and Walnut Salad", "Thinly sliced Vigezzino ham, served with a robust porcini mushroom and walnut salad", 400, 312, 6.00, MenuType.MENU, Set.of(AllergensEnum.NUTS));
        Course vegangStarterCourse = new Starters("kale chips, pumpkin and potatoes", "kale chips, pumpkin and potatoes", 120, 240, 5.0, MenuType.MENU, Set.of(AllergensEnum.KALE, AllergensEnum.PUMPKIN, AllergensEnum.POTATOES));
        Course bruschetta = new Starters("Bruschetta with fresh tomatoes and basil", "Toasted bread slice topped with garlic, olive oil, fresh diced tomatoes, and chopped basil", 70, 150, 5.0, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course eggplatnParmesan = new Starters("Eggplant Parmesan Bites", "A quick and easy appetizer made of fried eggplant cubes topped with tomato sauce and grated Parmesan cheese", 100, 200, 7, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.DAIRY));

        // - FIRSTS
        Course genovese = new Firsts("Genovese", "Traditional Ligurian dish made with slow-cooked onions, served with a fragrant basil pesto sauce and freshly grated Parmesan cheese.", 8.50, 160, 12.99, MenuType.MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course carbonara = new Firsts("Carbonara", "A classic Roman pasta dish, featuring spaghetti in a creamy sauce made with eggs, pancetta, and Pecorino Romano cheese.", 9.00, 160, 12.99, MenuType.MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.EGG, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course gricia = new Firsts("Gricia", "A simple but flavorful pasta dish from Rome, featuring bucatini pasta in a sauce made with pork jowl, Pecorino Romano cheese, and black pepper.", 10, 120, 14.99, MenuType.MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course amatriciana = new Firsts("Amatriciana", "Hearty pasta dish from the town of Amatrice, featuring bucatini pasta in a tangy tomato sauce with cured pork cheek and Pecorino Romano cheese.", 10, 130, 10.99, MenuType.MEAT_MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course orecchiette = new Firsts("Orecchiette broccoli and sausage", "Ear-shaped pasta from Puglia, tossed with tender broccoli florets, savory sausage, garlic, and olive oil.", 8, 120, 7.99, MenuType.MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course tagliatelle = new Firsts("Tagliatelle with white meat sauce and frutti di mare", "Ribbon-shaped pasta in a rich and creamy sauce made with tender white meat, Parmesan cheese, and a hint of nutmeg.", 7, 150, 18.99, MenuType.FISH_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN, AllergensEnum.DAIRY));
        Course veganFirstCourse = new Firsts("Lentil ragout", "Lentil ragout", 400, 200, 15.99, MenuType.VEGAN_MENU, Set.of(AllergensEnum.LENTIL));
        Course firtstChildren = new Firsts("Pasta with sauce", "Classic pasta with sauce and basil", 500, 200, 7.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course pennePesto = new Firsts("Penne with Pesto Sauce", "Penne pasta in a creamy pesto sauce made with basil, garlic, pine nuts, and Parmesan cheese.", 120, 200, 9.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course ravioliButterSage = new Firsts("Ravioli with Butter and Sage", "Homemade ravioli filled with ricotta cheese and spinach, served with a delicious butter and sage sauce.", 150, 350, 12.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN, AllergensEnum.DAIRY));

        // - SECONDS
        Course florentine = new Seconds("Rare Florentine", "Tender and juicy classic steak with a delicious char on the outside, served with roasted vegetables and crispy potatoes.", 20, 1000, 17.99, MenuType.MEAT_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course wagyu = new Seconds("Wagyu", "Luxurious premium cut cooked to perfection, served with creamy mashed potatoes and steamed green beans.", 30, 400, 18.99, MenuType.MENU, Set.of(AllergensEnum.DAIRY));
        Course kangarooSausage = new Seconds("Kangaroo Sausage", "Unique and flavorful sausage made with lean, tender kangaroo meat, served with sauerkraut and homemade mustard.", 25, 750, 20.99, MenuType.MENU, Set.of(AllergensEnum.MUSTARD));
        Course meatRolls = new Seconds("Meat Rolls", "Hearty and delicious appetizer with seasoned ground beef wrapped in crispy pastry, served with tomato dipping sauce.", 15, 300, 12.59, MenuType.MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course beefTartare = new Seconds("Beef Tartare", "Indulgent dish made with fresh high-quality beef, seasoned to perfection and served with toasted bread and mixed greens.", 24, 300, 21.99, MenuType.MEAT_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course hamburger = new Seconds("Hamburger", "Classic 100% beef burger with traditional toppings, satisfying and affordable.", 12, 220, 22.00, MenuType.MEAT_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course veganSecondCourse = new Seconds("Spiced Carrot Falafel", "Spiced Carrot Falafel", 400, 200, 15.99, MenuType.VEGAN_MENU, Set.of(AllergensEnum.LENTIL));
        Course cutletPotatoes = new Seconds("chicken cutlet with a portion of fries", "classic fried or baked chicken cutlet with fries", 400, 700, 13.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.NONE));
        Course fishAndChips = new Seconds("Fish and Chips", "Crispy battered fish served with classic British-style chips.", 250, 550, 13.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN, AllergensEnum.FISH));
        // - DESSERTS
        Course appleCake = new Desserts("Apple cake", "American apple pie", 1.000, 220, 12.99, MenuType.FISH_MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course tiramisu = new Desserts("Tiramisù", "Dessert with coffe, biscuits, cocoa", 1.000, 200, 10.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.EGG));
        Course saltyChocolate = new Desserts("Salty chocolate ice cream", "Ice-cream with chocolate fondant and milk chocolate", 500, 250, 8.99, MenuType.VEGAN_MENU, Set.of(AllergensEnum.DAIRY));
        Course sacherTorte = new Desserts("Sachertorte", "Dessert with lemon cream", 700, 250, 9.99, MenuType.MEAT_MENU, Set.of(AllergensEnum.DAIRY, AllergensEnum.EGG, AllergensEnum.CEREALS_CONTAINING_GLUTEN));
        Course composeYourDessert = new Desserts("Compose your dessert", "Spiced Carrot Falafel", 400, 650, 19.99, MenuType.MENU, Set.of(AllergensEnum.CARROT, AllergensEnum.SPICED));
        Course tiramisuVegano = new Desserts("Vegan Tiramisù", "Dessert vegan, with coffe, biscuits, cocoa", 1.000, 200, 15.99, MenuType.VEGAN_MENU, Set.of(AllergensEnum.DAIRY));
        Course chocolateBrownie = new Desserts("Chocolate Brownie with Ice Cream", "Rich and chocolatey brownie served warm with a scoop of vanilla ice cream.", 150, 400, 6.99, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN, AllergensEnum.DAIRY));

        // - BEVERAGES
        Course stillWater = new Beverages("Still Water", "Refreshing and hydrating still water in a one-liter bottle.", 1000, 250, 1.00, MenuType.MENU, Set.of(AllergensEnum.NONE), false);
        Course sparklingWater = new Beverages("Sparkling Water", "Fizzy and invigorating sparkling water in a one-liter bottle.", 1000, 250, 1.00, MenuType.MENU, Set.of(AllergensEnum.NONE), false);
        Course cocacola = new Beverages("Coca Cola", "Classic and delicious Coca-Cola in a 33cl bottle.", 330, 250, 2.00, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.NONE), false);
        Course fanta = new Beverages("Fanta", "Fruity and refreshing Fanta in a 33cl bottle.", 330, 250, 2.00, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.NONE), false);
        Course sprite = new Beverages("Sprite", "Lemon-lime flavored and thirst-quenching Sprite in a 33cl bottle.", 330, 250, 2.00, MenuType.CHILDREN_MENU, Set.of(AllergensEnum.NONE), false);
        Course redDraughtBeer = new Beverages("Red Draught Beer", "Rich and flavorful red draught beer served in a 0.4-liter glass.", 400, 250, 4, MenuType.MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN), true);
        Course blondeDraughtBeer = new Beverages("Blonde Draught Beer", "Crisp and refreshing blonde draught beer served in a 0.4-liter glass.", 400, 250, 3.5, MenuType.MENU, Set.of(AllergensEnum.CEREALS_CONTAINING_GLUTEN), true);
        Course redWine = new Beverages("Red Wine", "Smooth and full-bodied red wine served in a 50ml glass.", 50, 250, 5, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course whiteWine = new Beverages("White Wine", "Light and refreshing white wine served in a 50ml glass.", 50, 250, 5, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course Mojito = new Beverages("Mojito", "A classic cocktail made with rum, sugar, lime juice, soda water, and mint leaves. Refreshing and perfect for warm weather.", 130, 250, 7, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course oldFashioned = new Beverages("Old Fashioned", "A sophisticated cocktail made with whiskey, sugar, bitters, and water or soda. Perfect as an after-dinner drink.", 130, 250, 7, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course whiskeySour = new Beverages("Whiskey Sour", "A tangy and refreshing cocktail made with whiskey, lemon juice, and sugar. Great for any occasion.", 130, 250, 7, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course negroni = new Beverages("Negroni", "A complex and bitter cocktail made with gin, vermouth, and Campari. Perfect as an aperitif.", 130, 250, 7, MenuType.MENU, Set.of(AllergensEnum.NONE), true);
        Course whiteRussian = new Beverages("White Russian ", "A rich and creamy cocktail made with vodka, coffee liqueur, and cream. Perfect as a dessert drink.", 130, 250, 7, MenuType.MENU, Set.of(AllergensEnum.NONE), true);

        //MENU
        Menu fullMenu = new Menu("Menu", MenuType.MENU);
        Menu childrenMenu = new Menu("Children's Menu", MenuType.CHILDREN_MENU);
        Menu veganMenu = new Menu("Vegan Menu", MenuType.VEGAN_MENU);
        Menu fishMenu = new Menu("Fish Menu", MenuType.FISH_MENU);
        Menu fewKcalMenu = new Menu("Few KCal Menu", MenuType.FEW_KCAL_MENU);
        Menu meatMenu = new Menu("Meat Menu" , MenuType.MEAT_MENU);

        // Ristorante
        Restaurant ilSolito = new Restaurant("il Solito");

        List<Course> startersList = Arrays.asList(ffc, pineDuck, typicalHam, carneSalada, salmon, lamb, hamPorcini, vegangStarterCourse, bruschetta, eggplatnParmesan);
        List<Course> firstsList = Arrays.asList(genovese, carbonara, gricia, amatriciana, orecchiette, tagliatelle, veganFirstCourse, firtstChildren, pennePesto, ravioliButterSage);
        List<Course> secondsList = Arrays.asList(florentine, wagyu, kangarooSausage, meatRolls, beefTartare, hamburger, veganSecondCourse, cutletPotatoes, fishAndChips);
        List<Course> dessertsList = Arrays.asList(appleCake, tiramisu, saltyChocolate, sacherTorte, composeYourDessert, tiramisuVegano, chocolateBrownie);
        List<Course> beverageList = Arrays.asList(stillWater, sparklingWater, cocacola, fanta, sprite, redDraughtBeer, blondeDraughtBeer, redWine, whiteWine, Mojito, oldFashioned, whiskeySour, negroni, whiteRussian);

        fullMenu.addAllCourse(startersList);
        fullMenu.addAllCourse(firstsList);
        fullMenu.addAllCourse(secondsList);
        fullMenu.addAllCourse(dessertsList);
        fullMenu.addAllCourse(beverageList);

        meatMenu.addAllCourse(fullMenu.getCourseList().stream().filter(c -> c.getMenuType() == MenuType.MEAT_MENU || c.getClass() == Beverages.class).toList());
        childrenMenu.addAllCourse(fullMenu.getCourseList().stream().filter(c -> c.getMenuType() == MenuType.CHILDREN_MENU || c.getClass() == Beverages.class).toList());
        veganMenu.addAllCourse(fullMenu.getCourseList().stream().filter(c -> c.getMenuType() == MenuType.VEGAN_MENU || c.getClass() == Beverages.class ).toList());
        fishMenu.addAllCourse(fullMenu.getCourseList().stream().filter(c -> c.getMenuType() == MenuType.FISH_MENU || c.getClass() == Beverages.class).toList());
        fewKcalMenu.addAllCourse(fullMenu.getCourseList().stream().filter(c -> c.getCalories() < 500).toList());

        ilSolito.addAllMenu(Arrays.asList(meatMenu, fishMenu, veganMenu, childrenMenu, fewKcalMenu));
        ilSolito.printAllMenus();
        ilSolito.chooseOneMenu("Meat Menu").checkAllergens();



    }
}
