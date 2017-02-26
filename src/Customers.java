import java.util.Random;

public class Customers {
    private int numberOfCustomers;
    private int lostCustomers;
    //add queue

    public Customers() {
        lostCustomers = 0;
    }

    public int numberOfCustomers() {
        Random rand = new Random();
        numberOfCustomers = rand.nextInt(100);
        return numberOfCustomers;
    }


}
