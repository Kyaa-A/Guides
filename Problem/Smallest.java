package Problem;
public class Smallest {
    public static void main(String[] args) {
        
        int[] arr = {90, 20, 10, 40, 60};

        int smallest = arr[0];

        //Find the Smallest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){ //Change to greater than to find the Greatest
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
