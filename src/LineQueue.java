public class LineQueue<T> implements QueueInterface<T> {
    private Node tail;
    private Node head;
    private final int MAX_LINE_CAPACITY = 50; // number of customers line can hold
    private int numberOfCustomers;
    public LineQueue() {
        numberOfCustomers = 0;
        tail = null;
        head = null;
    }

    /**
     * Adds a new entry to the back of this queue.
     *
     * @param newEntry An object to be added.
     */
    @Override
    public void enqueue(T newEntry) {
        if (numberOfCustomers < MAX_LINE_CAPACITY){
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }

        tail = newNode;
        numberOfCustomers++;
        } else {
            throw new IllegalStateException();
        }

    }

    /**
     * Removes and returns the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        } else {
            T temp = getFront();
            head.setData(null);
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            numberOfCustomers--;
            return temp;
        }

    }

    /**
     * Retrieves the entry at the front of this queue.
     *
     * @return The object at the front of the queue.
     * @throws EmptyQueueException if the queue is empty.
     */
    @Override
    public T getFront() {
        if (isEmpty())
            throw new EmptyQueueException();
        else
            return head.getData();
    }

    /**
     * Detects whether this queue is empty.
     *
     * @return True if the queue is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    /**
     * Removes all entries from this queue.
     */
    @Override
    public void clear() {
        tail = null;
        head = null;

    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public boolean isFull() {
        return numberOfCustomers == MAX_LINE_CAPACITY;
    }


    private class Node {
        private T data;
        private Node next;

        public Node(T newData) {
            data = newData;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
