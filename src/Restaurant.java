public class Restaurant {
    public static void main(String[] args) {
        TimeAndDate simulatedTime = new TimeAndDate();
        FoodInventory foodInventory = new FoodInventory();
        Menu restaurantMenu = new Menu();
        Customers customers = new Customers();
        int shipmentCounter = 0;
        while (!simulatedTime.isEndOfMarch()) {
            while (!simulatedTime.isOpen()) {
                if (simulatedTime.isRestockTime() && shipmentCounter == 3) {
                    foodInventory.randomFillInventory(simulatedTime.dateToInt());
                    shipmentCounter = 0;
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

            //sort and remove expired
            foodInventory.sortInventory();
            foodInventory.removeExpired(simulatedTime.dateToInt());

            //print daily report
            System.out.println("******************REPORT FOR " + simulatedTime.getReportDate() + " ***************************");
            System.out.println("                     *ORDER REPORT*                            ");
            restaurantMenu.displayMenuCount();
            System.out.println("                     *LOST CUSTOMERS REPORT*                            ");
            customers.lostCustomersDisplay();
            System.out.println("                    *WASTED FOOD REPORT*                ");
            foodInventory.wastedFoodReport();

            //reset counters
            customers.resetLostCustomers();
            restaurantMenu.resetCounters();
            foodInventory.resetWasteCounters();

            shipmentCounter++;
            simulatedTime.nextDay();
        }


    }
}
