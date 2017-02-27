public class Restaurant {
    public static void main(String[] args) {
        TimeAndDate simulatedTime = new TimeAndDate();
        FoodInventory foodInventory = new FoodInventory();
        Menu restaurantMenu = new Menu();
        Customers customers = new Customers();
        while (!simulatedTime.isEndOfMarch()) {
            while (!simulatedTime.isOpen()) {
                //add number of customers for that hour
                if (simulatedTime.isRestockTime()){
                    foodInventory.randomFillInventory(simulatedTime.dateToInt());
                }
                customers.addCustomersToLine();
                while (!customers.isLineEmpty()) {
                    int orderNumber = customers.customerOrderSimulation();
                    switch (orderNumber) {
                        case 1:
                            restaurantMenu.menuItem1(foodInventory, customers);
                            break;
                        case 2:
                            restaurantMenu.menuItem2(foodInventory, customers);
                            break;
                        case 3:
                            restaurantMenu.menuItem3(foodInventory, customers);
                            break;
                        case 4:
                            restaurantMenu.menuItem4(foodInventory, customers);
                            break;
                        case 5:
                            restaurantMenu.menuItem5(foodInventory, customers);
                            break;
                        case 6:
                            restaurantMenu.menuItem6(foodInventory, customers);
                            break;
                    }
                }

                simulatedTime.nextHour();
            }
            foodInventory.randomFillInventory(simulatedTime.dateToInt());
            restaurantMenu.displayMenuCount();
            customers.lostCustomersDisplay(simulatedTime.getDate());
            foodInventory.sortInventory();
            simulatedTime.nextDay();
        }




    }
}
