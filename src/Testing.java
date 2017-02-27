import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by Michael on 2/25/2017.
 */
public class Testing<T extends Comparable<T>> {
    public static void main(String[] args) {
        FoodInventory foodInventory = new FoodInventory();
        Menu menu = new Menu();
        Customers customers = new Customers();

        foodInventory.randomFillInventory(322);
        menu.menuItem1(foodInventory,customers);
        menu.menuItem1(foodInventory,customers);
        menu.menuItem1(foodInventory,customers);
        menu.menuItem1(foodInventory,customers);
        menu.menuItem1(foodInventory,customers);


        foodInventory.randomFillInventory(999);
        foodInventory.getBunStack().display();


    }
}

























