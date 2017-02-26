import java.util.Random;

/**
 * Created by Michael on 2/25/2017.
 */
public class Testing<T> {
    int data;
    public Testing(int data){
        this.data = data;
    }




    public static void main(String[] args) {
        FoodInventory foodInventory = new FoodInventory();
        foodInventory.randomFillInventory();
        Menu menuTest = new Menu();

    }
}


























//        System.out.println("BUN START: "+foodInventory.getBunStack().forTesting());
//
//        System.out.println("CHEESE START:"+foodInventory.getCheeseStack().forTesting());
//
//        System.out.println("Let start:" + foodInventory.getLettuceStack().forTesting());
//        System.out.println("PATTY START" + foodInventory.getPattyStack().forTesting());
//
//
//        menuTest.menuItem1(foodInventory);
//        System.out.println(foodInventory.getBunStack().forTesting());
//        System.out.println("CHEESE AFTER: " + foodInventory.getCheeseStack().forTesting());
//        System.out.println("Let after:" + foodInventory.getLettuceStack().forTesting());
//        System.out.println("PATTY after" + foodInventory.getPattyStack().forTesting());
