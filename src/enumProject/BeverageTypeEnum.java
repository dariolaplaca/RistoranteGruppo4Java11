package enumProject;

public enum BeverageTypeEnum {
    ALCOHOLIC("alcoholic"),
    SOFT("soft");
    String name;

    BeverageTypeEnum(String name) {
        this.name = name;
    }
}
