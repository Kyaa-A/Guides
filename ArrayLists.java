import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {
        
        // ARRAYLIST
        ArrayList<Integer> nums = new ArrayList<Integer>(); 

        nums.add(5); // Add in nums array
        nums.get(0); // 0 is index (unsay kuhaon)
        nums.size(); // Check nums length
        nums.set(0, 4); // (0 , 4) FIRST value is index, SECOND is new value
        nums.remove(0); // remove specific index
        nums.clear(); // remove all elements
        nums.sort(null); // sort array

        // LINKEDLIST

        LinkedList<Integer> num = new LinkedList<Integer>();
        //Same function with ArrayList but can utilize more methods.

        num.addFirst(1);
        num.addLast(5);
        num.removeFirst();
        num.removeLast();
        num.getFirst();
        num.getLast();


       /*  When To Use

        Use an ArrayList for storing and accessing data, and LinkedList to manipulate data. */
    }
}
