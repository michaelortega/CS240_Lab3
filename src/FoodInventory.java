import java.util.Arrays;
import java.util.Random;

public class FoodInventory {
    private FoodStack<Integer> bunStack;
    private FoodStack<Integer> pattyStack;
    private FoodStack<Integer> lettuceStack;
    private FoodStack<Integer> tomatoStack;
    private FoodStack<Integer> onionStack;
    private FoodStack<Integer> cheeseStack;

    //addd waste

    public FoodInventory(){
        bunStack = new FoodStack<>(5);
        pattyStack = new FoodStack<>(4);
        lettuceStack = new FoodStack<>(3);
        tomatoStack = new FoodStack<>(3);
        onionStack = new FoodStack<>(5);
        cheeseStack = new FoodStack<>(2);
    }


    public void randomFillInventory(int date){ // pass date
        Random rand = new Random();
        for (int i = 0; i <6; i++){
            int randomNumber = rand.nextInt(1001-700)+700; //(High-Low) + Low;   high(exclusive) low(inclusive) 700-1000
            int[] newInventory = new int [randomNumber];
            Arrays.fill(newInventory,date);
            switch (i){
                case 0:
                    fillStack(bunStack, newInventory);
                    break;
                case 1:
                    fillStack(pattyStack, newInventory);
                    break;
                case 2:
                    fillStack(lettuceStack, newInventory);
                    break;
                case 3:
                    fillStack(tomatoStack, newInventory);
                    break;
                case 4:
                    fillStack(onionStack, newInventory);
                    break;
                case 5:
                    fillStack(cheeseStack, newInventory);
                    break;
            }
        }
    }

    private void fillStack(FoodStack foodStack, int[] newInventory) {


        for (int i = 0; i < newInventory.length; i++) {
            if (foodStack.isFull()){
                break;
            }
            foodStack.push(newInventory[i]);
        }

        }


    public FoodStack getBunStack(){
        return bunStack;
    }

    public FoodStack getPattyStack() {
        return pattyStack;
    }

    public FoodStack getLettuceStack() {
        return lettuceStack;
    }

    public FoodStack getTomatoStack() {
        return tomatoStack;
    }

    public FoodStack getOnionStack() {
        return onionStack;
    }

    public FoodStack getCheeseStack() {
        return cheeseStack;
    }

    public void sortInventory(){
        bunStack.sortInventory();
        pattyStack.sortInventory();
        lettuceStack.sortInventory();
        tomatoStack.sortInventory();
        onionStack.sortInventory();
        cheeseStack.sortInventory();
    }

    public void removeExpired(int currentDate){
        bunStack.removeExpired(currentDate);
        pattyStack.removeExpired(currentDate);
        lettuceStack.removeExpired(currentDate);
        tomatoStack.removeExpired(currentDate);
        onionStack.removeExpired(currentDate);
        cheeseStack.removeExpired(currentDate);
    }

    public void wastedFoodReport(){

    }

    public void resetWasteCounters(){
        bunStack.resetWastedCounter();
        pattyStack.resetWastedCounter();
        lettuceStack.resetWastedCounter();
        tomatoStack.resetWastedCounter();
        onionStack.resetWastedCounter();
        cheeseStack.resetWastedCounter();
    }

}
