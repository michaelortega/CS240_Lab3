import java.util.Random;

public class Customers {
    private int lostCustomers;
    private LineQueue<Integer> lineQueue;
    private Random random;

    public Customers() {
        lostCustomers = 0;
        lineQueue = new LineQueue<>();
        random = new Random();
    }

    public int numberOfCustomers() {
        int numberOfCustomers = random.nextInt(101 - 1) + 1;
        return numberOfCustomers;
    }

    public void simulateCustomers() {
        int randomCustomerNumber = numberOfCustomers();
        fillQueue(randomCustomerNumber);

    }

    private void fillQueue(int randomCustomerNum) {
        try {
            for (int i = 0; i < randomCustomerNum; i++) {
                lineQueue.enqueue(generateOrder());
            }
        } catch (IllegalStateException e) {
            System.out.println("Line is full.");
        } finally {
            lostCustomers = randomCustomerNum - lineQueue.getNumberOfCustomers();
        }
    }

    private int generateOrder() {
        return random.nextInt(7 - 1) + 1;
    }

}
