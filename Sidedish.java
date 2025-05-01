public class Sidedish extends Menu {
    protected String name;
    protected double price;

    public Sidedish(String name, double price){
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

    @Override
    public void displayMenu(){
        System.out.println("Side Dish Name = " + name);
        System.out.println("Price = " + price);
    }
}
