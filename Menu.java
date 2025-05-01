import java.util.Scanner;

public class Menu {
    protected String name;
    protected double price;

    public Menu(){
        this.name = "Food Name";
        this.price = 0;
    }

    public Menu(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString(){
        return "name = " + name + "price = " + price;
    }

    public void displayMenu(){
        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
    }

    public void editMenuDetails(Scanner sc){
        System.out.println("Please Enter The New Name or Press Enter To Skip");
        String newName = sc.nextLine();
        if (! newName.equals("")){
            setName(newName);
        }

        System.out.println("Please Enter The New Price or Press Enter To Skips");
        String stringPrice = sc.nextLine();
        if(! stringPrice.equals("")){
            double newPrice = Double.parseDouble(stringPrice);
            setPrice(newPrice);
        }

    }
}
