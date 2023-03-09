import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Desserts> dessertsList;
    private List<Beverages> beveragesList;
    private List<Starters> startersList;

    public Menu() {
        beveragesList = new ArrayList<>();
        startersList = new ArrayList<>();
    }

    //TODO inseriamo tutte le liste, creiamo i metodi add e remove, stampa dei singoli sottomenù e stampa del menù unico
    //dobbiamo portare tutta la logica nel main qui dentro

    public List<Starters> getStartersList() {return startersList;}
    public void setStartersList(List<Starters> startersList) {this.startersList = startersList;}
    public void addStarter(Starters s){startersList.add(s);}
    public void removeStarter(Starters s){startersList.remove(s);}
    public void setBeveragesList(List<Beverages> bList){
        this.beveragesList = bList;
    }
    public List<Beverages> getBeveragesList(){
        return beveragesList;
    }
    public void addBeverage(Beverages b){
        beveragesList.add(b);
    }
    public void removeBeverage(Beverages b){
        beveragesList.remove(b);
    }
    public void printStarters() {
        System.out.println("\t\t-----------------\n\t\t|\tSTARTERS\t|\n\t\t-----------------");
        for(Starters s : startersList){
            s.printInfo();
            System.out.println();
        }
    }
    public void printBeverages(){
        System.out.println("\t\t-----------------\n\t\t|\tBEVERAGES\t|\n\t\t-----------------");
        for(Beverages b : beveragesList){
            b.printInfo();
            System.out.println();
        }
    }
    public void printMenu(){
        printStarters();
        printBeverages();
    }
}
