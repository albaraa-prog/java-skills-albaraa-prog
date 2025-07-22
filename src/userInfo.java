package src;

public class userInfo {
    String name, email;
    int age;
    Boolean isActive;

    public void set(String na, String em, int ag, Boolean iA){
        this.name = na;
        this.email = em;
        this.age = ag;
        this.isActive = iA;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }
    public Boolean getIsActive(){
        return isActive;
    }
    public void displayInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Age: " + getAge());
        if(getIsActive()) {
            System.out.println("Account status: Active");
        } else if(getIsActive() == false){
            System.out.println("Account status: Not Active");
        } else {
            System.out.println("Unkown");
        }
    }
    public static void main(String[] args) {
        userInfo uI = new userInfo();
        uI.set("Al Baraa", "albraa9021@gmail.com", 23, true);
        uI.displayInfo();
        uI.set("Ahmed", "amed9021@gmail.com", 24, false);
        uI.displayInfo();
        uI.set("khalid", "khalid9021@gmail.com", 25, true);
        uI.displayInfo();
    }
}
