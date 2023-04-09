public class Customer {
    private static int idCounter = 0;
    private int id;
    private String name;
    private MenuType menuType;
    private String mail;
    private String password;
    private boolean isVip;

    public Customer(String name, MenuType menuType, String mail, String password) {
        this.id = ++idCounter;
        this.name = name;
        this.menuType = menuType;
        this.mail = mail;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return this.menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void printInfo(){
        System.out.println(this.name + " " + this.menuType + " menu\n" + this.mail + "\nIs VIP: " + this.isVip);
    }
}
