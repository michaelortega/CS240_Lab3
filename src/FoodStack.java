import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class FoodStack<T extends Comparable> implements StackInterface<T> {
    private T [] stack;
    private int topOfStack;
    private final int MAX_STORE_CAPACITY = 10000;
    private int daysTillExpire;
    private int wastedFood;

    public FoodStack(int daysTillExpire){
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Comparable[MAX_STORE_CAPACITY];
        stack = tempStack;
        topOfStack = -1;
        this.daysTillExpire = daysTillExpire;
        wastedFood =0;
    }
    /**
     * Adds a new entry to the top of this stack.
     *
     * @param newEntry An object to be added to the stack.
     */
    @Override
    public void push(T newEntry) {
            stack[topOfStack + 1] = newEntry;
            topOfStack++;
    }

    /**
     * Removes and returns this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @throws EmptyStackException if the stack is empty before the operation.
     */
    @Override
    public T pop(){
        if (isEmpty()){
            throw new NoSuchElementException();
        } else {
            T temp = stack[topOfStack];
            stack[topOfStack] = null;
            topOfStack--;
            return temp;
        }

    }

    /**
     * Retrieves this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[topOfStack];
        }
    }

    /**
     * Detects whether this stack is empty.
     *
     * @return True if the stack is empty.
     */
    @Override
    public boolean isEmpty() {
        return topOfStack < 0;
    }

    /**
     * Removes all entries from this stack.
     */
    @Override
    public void clear() {
        for (int index = 0; index < stack.length; index++) {
            stack[index] = null;
        }
        topOfStack = -1;
    }


    public void sortInventory(){
        this.selectionSort(stack);
    }
    

    public void selectionSort(T[] array) {

        for (int sortedIndex = 0; sortedIndex < topOfStack + 1; sortedIndex++) {
            for (int unsortedIndex = sortedIndex + 1; unsortedIndex < topOfStack+1; unsortedIndex++) {
                int minimumIndex = sortedIndex;
                if (array[unsortedIndex].compareTo(array[minimumIndex]) > 0) {
                    minimumIndex = unsortedIndex;
                }
                T temp = array[minimumIndex];
                array[minimumIndex] = array[sortedIndex];
                array[sortedIndex] = temp;

            }
        }
    }


    public boolean isFull() {
        return (topOfStack+1)==MAX_STORE_CAPACITY;
    }

    public void display(){ // remove
        for (int t = topOfStack; t > -1; t-- )
            System.out.print(stack[t] + " ");
        System.out.println();
    }


    public void removeExpired(int currentDate) {
        int lowestExpirationDate = currentDate - daysTillExpire;
        for (int top =topOfStack; top>0; top--){
            if ((stack[top].compareTo(lowestExpirationDate) <= 0) && !isEmpty()){
                pop();
                wastedFood++;
            }
//            if (stack[top].compareTo(currentDate) == 0){
//                break;
//            }
        }
    }

    public void resetWastedCounter(){
        wastedFood=0;
    }
}
