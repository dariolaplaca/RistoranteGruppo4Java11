import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Starters> startersList;
    private List<Seconds> secondList;
    private List<Desserts> dessertsList;
    private List<Beverages> beveragesList;

    public Menu() {
        startersList = new ArrayList<>();
        secondList = new ArrayList<>();
        dessertsList = new ArrayList<>();
        beveragesList = new ArrayList<>();
    }

    //TODO inseriamo tutte le liste, creiamo i metodi add e remove, stampa dei singoli sottomenù e stampa del menù unico
    //dobbiamo portare tutta la logica nel main qui dentro

    public List<Starters> getStartersList() {return startersList;}
    public void setStartersList(List<Starters> startersList) {this.startersList = startersList;}
    public void addStarter(Starters s) {startersList.add(s);}
    public void removeStarter(Starters s) {startersList.remove(s);}


    public List<Seconds> getSecondsList() {return secondList;}
    public void setSecondsList(List<Seconds> secondList) {this.secondList = secondList;}
    public void addSecond(Seconds s) {secondList.add(s);}
    public void removeSecond(Seconds s) {secondList.remove(s);}

    public List<Desserts> getDessertsList() {return dessertsList;}
    public void setDessertsList(List<Desserts> dessertsList) {this.dessertsList = dessertsList;}
    public void addDessert(Desserts s) {dessertsList.add(s);}
    public void removeDessert(Desserts s) {dessertsList.remove(s);}

    public List<Beverages> getBeveragesList() {return beveragesList;}
    public void setBeveragesList(List<Beverages> bList) {this.beveragesList = bList;}
    public void addBeverage(Beverages b) {beveragesList.add(b);}
    public void removeBeverage(Beverages b) {beveragesList.remove(b);}

    public void printStarters() {
        System.out.println("\t\t-----------------\n\t\t|\tSTARTERS\t|\n\t\t-----------------");
        for (Starters s : startersList) {
            s.printInfo();
            System.out.println();
        }
    }

    public void printSeconds() {
        System.out.println("\t\t-------------\n\t\t|\tSECONDS\t|\n\t\t-------------");
        for (Seconds s : secondList) {
            s.printInfo();
            System.out.println();
        }
    }

    public void printDesserts() {
    System.out.println("\t\t--------------\n\t\t|\tDESSERTS\t|\n\t\t--------------");
        for (Desserts d : dessertsList) {
            d.printInfo();
            System.out.println();
        }
    }

    public void printBeverages() {
        System.out.println("\t\t-----------------\n\t\t|\tBEVERAGES\t|\n\t\t-----------------");
        for (Beverages b : beveragesList) {
            b.printInfo();
            System.out.println();
        }
    }

    public void printMenu() {
        printStarters();
        printSeconds();
        printDesserts();
        printBeverages();
    }
}
