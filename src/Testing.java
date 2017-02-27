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
    int i =0;
    T[] array;
    public Testing(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[5];
        array = temp;

    }




    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyy HH:mm");
         String startDate = "03012017 09:00";
        Date date = dateFormat.parse(startDate);
        cal.setTime(date);
        System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.DATE, 1);
        System.out.println("Add one day to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.MONTH, 1);
        System.out.println("Add one month to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.YEAR, 1);
        System.out.println("Add one year to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.HOUR, 1);
        System.out.println("Add one hour to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.MINUTE, 1);
        System.out.println("Add one minute to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.SECOND, 1);
        System.out.println("Add one second to current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.DATE, -1);
        System.out.println("Subtract one day from current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.MONTH, -1);
        System.out.println("Subtract one month from current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.YEAR, -1);
        System.out.println("Subtract one year from current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.HOUR, -1);
        System.out.println("Subtract one hour from current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.MINUTE, -1);
        System.out.println("Subtract one minute from current date : " + dateFormat.format(cal.getTime()));

        cal.add(Calendar.SECOND, -1);
        System.out.println("Subtract one second from current date : " + dateFormat.format(cal.getTime()));


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
