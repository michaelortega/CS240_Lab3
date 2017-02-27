
public class Menu {
    private MenuLinkedList<String> burgerList;
    private MenuLinkedList<String> cheeseBurgerList;
    private MenuLinkedList<String> veganBurgerList;
    private MenuLinkedList<String> burgerNoOnionList;
    private MenuLinkedList<String> cheeseBurgerNoOnionList;
    private MenuLinkedList<String> burgerNoTomatoList;

    public static final String BUN = "bun";
    public static final String PATTY = "patty";
    public static final String LETTUCE = "lettuce";
    public static final String TOMATO = "tomato";
    public static final String ONION = "onion";
    public static final String CHEESE = "cheese";

    private int menuItem1Ctr;
    private int menuItem2Ctr;
    private int menuItem3Ctr;
    private int menuItem4Ctr;
    private int menuItem5Ctr;
    private int menuItem6Ctr;

    public Menu() {
        menuItem1Ctr = 0;
        menuItem2Ctr = 0;
        menuItem3Ctr = 0;
        menuItem4Ctr = 0;
        menuItem5Ctr = 0;
        menuItem6Ctr = 0;
        burgerList = new MenuLinkedList<>(BUN, PATTY, LETTUCE, TOMATO, ONION);
        cheeseBurgerList = new MenuLinkedList<>(CHEESE, BUN, PATTY, LETTUCE, TOMATO);
        veganBurgerList = new MenuLinkedList<>(LETTUCE, LETTUCE, TOMATO, ONION);
        burgerNoOnionList = new MenuLinkedList<>(BUN, PATTY, LETTUCE, TOMATO);
        cheeseBurgerNoOnionList = new MenuLinkedList<>(CHEESE, BUN, PATTY, LETTUCE, TOMATO);
        burgerNoTomatoList = new MenuLinkedList<>(BUN, PATTY, LETTUCE, ONION);

    }

    public void menuItem1(FoodInventory foodInventory, Customers customers) {
            burgerList.useIngredients(foodInventory,customers);
            menuItem1Ctr++;
    }

    public void menuItem2(FoodInventory foodInventory, Customers customers) {
            cheeseBurgerList.useIngredients(foodInventory,customers);
            menuItem2Ctr++;
    }

    public void menuItem3(FoodInventory foodInventory, Customers customers) {
            veganBurgerList.useIngredients(foodInventory,customers);
            menuItem3Ctr++;
            customers.addLostCustomer();
    }

    public void menuItem4(FoodInventory foodInventory, Customers customers) {
            burgerNoOnionList.useIngredients(foodInventory,customers);
            menuItem4Ctr++;
    }

    public void menuItem5(FoodInventory foodInventory, Customers customers) {
            cheeseBurgerNoOnionList.useIngredients(foodInventory,customers);
            menuItem5Ctr++;
    }

    public void menuItem6(FoodInventory foodInventory, Customers customers) {
            burgerNoTomatoList.useIngredients(foodInventory,customers);
            menuItem6Ctr++;
    }

    public void displayMenuCount(){
        System.out.println("Number 1 (Burger)----------------------Number of orders: " + menuItem1Ctr);
        System.out.println("Number 2 (Cheese Burger----------------Number of orders: " + menuItem2Ctr);
        System.out.println("Number 3 (Lettuce Wrap Burger)         Number of orders: " + menuItem3Ctr);
        System.out.println("Number 4 (Burger - No Onions)          Number of orders: " + menuItem4Ctr);
        System.out.println("Number 5 (Cheese Burger - No Onions)   Number of orders: " + menuItem5Ctr);
        System.out.println("Number 6 (Burger - No Tomato)          Number of orders: " + menuItem6Ctr);
    }

    public void resetCounters() {
        menuItem1Ctr = 0;
        menuItem2Ctr = 0;
        menuItem3Ctr = 0;
        menuItem4Ctr = 0;
        menuItem5Ctr = 0;
        menuItem6Ctr = 0;
    }


    // reset day aka counters
}

