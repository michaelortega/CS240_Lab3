public class Restaurant {
    public static void main(String[] args) {
        FoodInventory foodInventory = new FoodInventory();
        foodInventory.randomFillInventory(); // initial inventory amount
        Menu restaurantMenu = new Menu();
        Customers customers = new Customers();


        try {
            //add number of customers for that hour
            customers.addCustomersToLine();
            while (true) {
                int orderNumber = customers.customerOrderSimulation();
                switch (orderNumber) {
                    case 1:
                        restaurantMenu.menuItem1(foodInventory);
                        break;
                    case 2:
                        restaurantMenu.menuItem2(foodInventory);
                        break;
                    case 3:
                        restaurantMenu.menuItem3(foodInventory);
                        break;
                    case 4:
                        restaurantMenu.menuItem4(foodInventory);
                        break;
                    case 5:
                        restaurantMenu.menuItem5(foodInventory);
                        break;
                    case 6:
                        restaurantMenu.menuItem6(foodInventory);
                        break;
                }
            }
        } catch (EmptyQueueException eqe) {
            System.out.println("All customers in line have been served . . .");
        }

        restaurantMenu.displayMenuCount();
        customers.lostCustomersDisplay();


    }
}
