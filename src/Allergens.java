public enum Allergens {

    CEREALS_CONTAINING_GLUTEN("Gluten"),
    EGG("Egg"),
    SHELLFISH("Shellfish"),
    CELERY("Celery"),
    MUSTARD("Mustard"),
    NUTS("Nuts"),
    PEANUTS("Peanuts"),
    SESAME_SEEDS("Sesame Seeds"),
    SOY("Soy"),
    LUPIN("Lupin"),
    MOLLUSCS("Molluscs"),
    FISH("Fish"),
    DAIRY("Dairy"),
    SULPHITES("Sulphites");

    String name;


    Allergens(String name) {
        this.name = name;
    }
}
