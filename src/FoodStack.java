import java.util.EmptyStackException;

public class FoodStack<T> implements StackInterface<T> {
    private T [] stack;
    private int topOfStack;
    private final int MAX_STORE_CAPACITY = 10000;


    public FoodStack(){
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[MAX_STORE_CAPACITY];
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
        if (topOfStack < MAX_STORE_CAPACITY){
            stack[++topOfStack] = newEntry;
        }
    }

    /**
     * Removes and returns this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @throws EmptyStackException if the stack is empty before the operation.
     */
    @Override
    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
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

}
