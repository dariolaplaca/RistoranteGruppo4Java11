package enumProject;

/**
 * that enum contains the allergens defined by the European community
 */
public enum AllergensEnum {
    CEREALS_CONTAINING_GLUTEN(1, "Gluten"),
    EGG(2, "Egg"),
    SHELLFISH(3, "Shellfish"),
    CELERY(4, "Celery"),
    MUSTARD(5, "Mustard"),
    NUTS(6, "Nuts"),
    PEANUTS(7, "Peanuts"),
    SESAME_SEEDS(8, "Sesame Seeds"),
    SOY(9, "Soy"),
    LUPIN(10, "Lupin"),
    MOLLUSCS(11, "Molluscs"),
    FISH(12, "Fish"),
    DAIRY(13, "Dairy"),
    SULPHITES(14, "Sulphites"),
    PUMPKIN(15, "Pumpkin"),
    POTATOES(16, "Potatoes"),
    KALE(17, "Kale"),
    LENTIL(18, "Lentil"),
    CARROT(19, "Carrot "),
    NONE(20, "Allergens not present"),
    SPICED(21, "Spiced");

    public String name;
    public Integer id;

    AllergensEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static AllergensEnum getAllergenById(int id){
        AllergensEnum allergenToReturn = AllergensEnum.NONE;
        for(AllergensEnum allergen : AllergensEnum.values()){
            if(allergen.id == id){
                allergenToReturn = allergen;
            }
        }
        return allergenToReturn;
    }

    public static AllergensEnum getAllergenByName(String name){
        AllergensEnum allergenToReturn = AllergensEnum.NONE;
        for(AllergensEnum allergen : AllergensEnum.values()){
            if(allergen.name.equals(name)){
                allergenToReturn = allergen;
            }
        }
        return allergenToReturn;
    }

}
