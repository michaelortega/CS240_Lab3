import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class FoodStack<T extends Comparable> implements StackInterface<T> {
    private T [] stack;
    private int topOfStack;
    private final int MAX_STORE_CAPACITY = 5000;


    public FoodStack(){
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Comparable[MAX_STORE_CAPACITY];
        stack = tempStack;
        topOfStack = -1;
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
            stack[topOfStack--] = null;
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

    public int getNumberOfitems(){
        return topOfStack;
    } // removeeeeeee


    public void sortInventory(){
        this.insertionSort(stack);
    }

    public void insertionSort(T[] elems) {
        int size = topOfStack;
        for (int outerLoopIdx = 1; outerLoopIdx < size; ++outerLoopIdx) {
            for (int innerLoopIdx = outerLoopIdx; innerLoopIdx > 0; --innerLoopIdx) {
                if (elems[innerLoopIdx - 1].compareTo(elems[innerLoopIdx]) > 0) {
                    T temp = elems[innerLoopIdx - 1];
                    elems[innerLoopIdx - 1] = elems[innerLoopIdx];
                    elems[innerLoopIdx] = temp;
                }
            }
        }
    }

    public boolean isFull() {
        return (topOfStack+1)==MAX_STORE_CAPACITY;
    }
//
//    public void display(){
//        for (T i: stack){
//            System.out.println(i + " ");
//        }
//        System.out.println();
//    }


}
