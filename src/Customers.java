import java.util.Random;

public class Customers {
    private int lostCustomers;
    private LineQueue<Integer> lineQueue;
    private Random random;
    private int randomCustomerNumber; // number of customers for the hour

    public Customers() {
        lostCustomers = 0;
        randomCustomerNumber = 0;
        lineQueue = new LineQueue<>();
        random = new Random();
    }

    public int numberOfCustomers() {
        return random.nextInt(101 - 1) + 1;
    }

    public void addCustomersToLine() {
        resetCustomers();
        randomCustomerNumber = numberOfCustomers();
        System.out.println("Number of customers entering: " + randomCustomerNumber + "\n");
        fillQueue(randomCustomerNumber);
    }

    private void resetCustomers() {
        lineQueue.clear();
    }
    public void resetLostCustomers(){
        lostCustomers =0;
    }

    public int customerOrderSimulation(){
       return lineQueue.dequeue();
    }

    private void fillQueue(int randomCustomerNum) {
        try {
            for (int i = 0; i < randomCustomerNum; i++) {
                lineQueue.enqueue(generateOrder());
            }
        } catch (IllegalStateException e) {
            System.out.println("Line is full. Customers leaving . . . \n");
        } finally {
            lostCustomers = lostCustomers + randomCustomerNum - lineQueue.getNumberOfCustomers();
        }
    }

    private int generateOrder() {
        return random.nextInt(7 - 1) + 1;
    }

    public void lostCustomersDisplay(){
        System.out.println("Number of lost customers: " + lostCustomers);
    }

}
