public class Restaurant {
    public static void main(String[] args) {
        TimeAndDate sTime = new TimeAndDate();
        FoodInventory foodInventory = new FoodInventory();
        foodInventory.randomFillInventory(sTime.dateToInt()); // initial inventory amount
        Menu restaurantMenu = new Menu();
        Customers customers = new Customers();

        int daysRunning = 1;
        int hour = 9;
        while (daysRunning <32){
            while (hour <)



            daysRunning++;
        }

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
        foodInventory.sortInventory();


    }
}
