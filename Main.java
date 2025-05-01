import java.util.ArrayList;
import java.util.Scanner;

//View all items
// Add a menu item
//Update an item’s price or name
//Delete an item
//Inheritance: MenuItem → Drink, MainCourse
//Interface: Displayable with method showItemDetails()

public class Main {

    public static Scanner sc;
    public static ArrayList<Menu> menuDataBase;
    public static ArrayList<Maindish> mainDishDataBase;
    public static ArrayList<Sidedish> sideDishDataBase;

    public static void main(String[] args) {

        menuDataBase = new ArrayList<Menu>();
        mainDishDataBase = new ArrayList<Maindish>();
        sideDishDataBase = new ArrayList<Sidedish>();

        var seafoodFriedRice = new Maindish("Seafood Fried Rice", 7.00);
        menuDataBase.add(seafoodFriedRice);
        mainDishDataBase.add(seafoodFriedRice);

        var sambalFriedRice = new Maindish("Sambal Fried Rice", 7.00);
        menuDataBase.add(sambalFriedRice);
        mainDishDataBase.add(sambalFriedRice);


        var sotongRings = new Sidedish("Sotong Rings", 10.00);
        menuDataBase.add(sotongRings);
        sideDishDataBase.add(sotongRings);


        while (true) {
            sc = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. See Menu ");
            System.out.println("2. Add A Menu Item ");
            System.out.println("3. Edit A Menu Item ");
            System.out.println("4. Delete A Menu Item ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                showMenu();
            }
            if (choice == 2) {
                addMenu();
            }
            if (choice == 3){
                editMenu();
            }
            if (choice == 4){
                deleteMenu();
            }
        }
    }

    public static void showMenu() {
        System.out.println("Please choose a option");

        System.out.println("1. Show all");
        System.out.println("2. Main Dish");
        System.out.println("3. Side Dish");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            showAllFood();
        }
        if (choice == 2) {
            showMainDish();
        }
        if (choice == 3) {
            showSideDish();
        }
    }

    public static void showAllFood() {
        System.out.println("ALL FOOD");
        for (Menu f : menuDataBase) {
            f.displayMenu();
            System.out.println();
        }
    }

    public static void showMainDish() {
        System.out.println("MAIN DISH");
        for (Menu md : mainDishDataBase) {
            md.displayMenu();
        }

    }

    public static void showSideDish() {
        System.out.println("SIDE DISH");
        for (Menu sd : sideDishDataBase) {
            sd.displayMenu();
        }
    }

    public static void addMenu(){
        System.out.println("Adding to Menu");
        System.out.println("1. Add to Main Dish");
        System.out.println("2. Add to Side Dish");

        int choice = sc.nextInt();
            sc.nextLine();

        if(choice == 1 || choice == 2){
            System.out.println("Enter The Dish Name");
            String name = sc.nextLine();
            System.out.println();
            System.out.println("Enter the price");
            double price = sc.nextInt();

            if(choice == 1){
                Maindish newMainDish = new Maindish(name, price);
                mainDishDataBase.add(newMainDish);
                menuDataBase.add(newMainDish);
            } 
            if(choice == 2){
                Sidedish newSideDish = new Sidedish(name, price);
                sideDishDataBase.add(newSideDish);
                menuDataBase.add(newSideDish);
            }
        }
    }

    public static void editMenu(){
        System.out.println("Edit Dish");
        for (int i = 0; i < menuDataBase.size(); i++){
            System.out.println("Index: " + i);
            Menu m = menuDataBase.get(i);
            m.displayMenu();
            System.out.println();
        }
        System.out.println();
        System.out.println("Enter The Index Number For The Dish You Want Edit");
        int index = sc.nextInt();
        sc.nextLine();

        Menu editDish = menuDataBase.get(index);
        editDish.editMenuDetails(sc);

    }

    public static void deleteMenu(){
        System.out.println("Delete Menu Item");
        for (int i = 0; i < menuDataBase.size(); i++){
            System.out.println("Index: " + i);
            Menu d = menuDataBase.get(i);
            d.displayMenu();
        }
        System.out.println();
        System.out.println("Enter The Index For The Dish You Want Delete");
        int index = sc.nextInt();
        sc.nextLine();
        menuDataBase.remove(index);
        mainDishDataBase.remove(menuDataBase.get(index));
        sideDishDataBase.remove(menuDataBase.get(index));


    }
}