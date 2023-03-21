import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Starters> startersList;
    private List<Firsts> firstsList;
    private List<Seconds> secondList;
    private List<Desserts> dessertsList;
    private List<Beverages> beveragesList;
    TypeEnum type = TypeEnum.MEAT_BASED;

    public Menu() {
        startersList = new ArrayList<>();
        firstsList = new ArrayList<>();
        secondList = new ArrayList<>();
        dessertsList = new ArrayList<>();
        beveragesList = new ArrayList<>();
    }


    public List<Starters> getStartersList() {return startersList;}
    public void setStartersList(List<Starters> startersList) {this.startersList = startersList;}
    public void addStarter(Starters s) {startersList.add(s);}
    public void removeStarter(Starters s) {startersList.remove(s);}
    public void addAllStarters(List<Starters> s) {startersList.addAll(s);}

    public List<Firsts> getFirstsList() {return firstsList;}
    public void setFirstsList(List<Firsts> firstsList) {this.firstsList = firstsList;}
    public void addFirsts(Firsts f) {firstsList.add(f);}
    public void removeFirsts(Firsts f) {firstsList.remove(f);}

    public List<Seconds> getSecondsList() {return secondList;}
    public void setSecondsList(List<Seconds> secondList) {this.secondList = secondList;}
    public void addSecond(Seconds s) {secondList.add(s);}
    public void removeSecond(Seconds s) {secondList.remove(s);}
    public void addAllSeconds(List<Seconds> secondList){this.secondList.addAll(secondList);}

    public List<Desserts> getDessertsList() {return dessertsList;}
    public void setDessertsList(List<Desserts> dessertsList) {this.dessertsList = dessertsList;}
    public void addDessert(Desserts s) {dessertsList.add(s);}
    public void addAllDessert(List<Desserts> s) {dessertsList.addAll(s);}
    public void removeDessert(Desserts s) {dessertsList.remove(s);}
    public void removeAllDessert(List<Desserts> s) {dessertsList.removeAll(s);}

    public List<Beverages> getBeveragesList() {return beveragesList;}
    public void setBeveragesList(List<Beverages> bList) {this.beveragesList = bList;}
    public void addBeverage(Beverages b) {beveragesList.add(b);}
    public void removeBeverage(Beverages b) {beveragesList.remove(b);}
    public void addAllBeverage(List<Beverages> bList){
        beveragesList.addAll(bList);
    }

    public void printStarters() {
        final String emoji_sparkles = "\u2728";
        System.out.println("\n\t" + emoji_sparkles + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + "STARTERS" + TextModifier.ANSI_RESET + emoji_sparkles + "\n");
        for (Starters s : startersList) {
            s.printInfo();
            System.out.println();
        }
    }

    public void printFirsts() {
        System.out.println("\t\t-------------\n\t\t|\tFIRSTS\t|\n\t\t-------------");
        for(Firsts f : firstsList){
            f.printInfo();
            System.out.println();
        }
    }

    public void printSeconds() {
        final String EMOJI_BURGER = "\uD83C\uDF54";
        System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_PURPLE + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + "\tSECONDS" + TextModifier.ANSI_RESET + EMOJI_BURGER + "\n");
        for (Seconds s : secondList) {
            s.printInfo();
            System.out.println();
        }
    }

    public void printDesserts() {
        final String EMOJI_ICE_CREAM =  "\uD83C\uDF70";
    System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_YELLOW + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE +"\tDESSERTS" + TextModifier.ANSI_RESET +"\t"+ EMOJI_ICE_CREAM + "\n");
        for (Desserts d : dessertsList) {
            d.printInfo();
            System.out.println();
        }
    }

    public void printBeverages() {
        final String EMOJI_WINE = "\uD83C\uDF77";
        System.out.println("\n\t" + TextModifier.ANSI_BRIGHT_RED + TextModifier.ANSI_BOLD + TextModifier.ANSI_UNDERLINE + "\tBEVERAGES" + TextModifier.ANSI_RESET + EMOJI_WINE + "\n");
        for (Beverages b : beveragesList) {
            b.printInfo();
            System.out.println();
        }
    }

    public void printMenu() {
        printStarters();
        printFirsts();
        printSeconds();
        printDesserts();
        printBeverages();
    }
}
