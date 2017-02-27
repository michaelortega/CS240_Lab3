import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by Michael on 2/25/2017.
 */
public class Testing<T extends Comparable<T>> {
    int i =0;
    T[] array;
    public Testing(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[5];
        array = temp;

    }




    public static void main(String[] args) {
        Calendar calendar;
        calendar.setTimeInMillis();


    }

    private void add(T x) {
        array[i] = x;
        i++;
    }
    public void sort(){
      //  QuickSort.sort(array);
    }

    public void display(){
        for (T y: array){
            System.out.print(y + " ");
        }
        System.out.println();
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
