
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

    public void menuItem1(FoodInventory foodInventory) {
        burgerList.useIngredients(foodInventory);
        menuItem1Ctr++;
    }

}

