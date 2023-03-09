import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Desserts> dessertsList;
    private List<Beverages> beveragesList;

    public Menu() {
        beveragesList = new ArrayList<>();
    }

    //TODO inseriamo tutte le liste, creiamo i metodi add e remove, stampa dei singoli sottomenù e stampa del menù unico
    //dobbiamo portare tutta la logica nel main qui dentro


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
    public void printBeverages(){
        System.out.println("\t\t-----------------\n\t\t|\tBEVERAGES\t|\n\t\t-----------------");
        for(Beverages b : beveragesList){
            b.printInfo();
            System.out.println();
        }
    }

    public void printMenu(){
        printBeverages();
    }
}
