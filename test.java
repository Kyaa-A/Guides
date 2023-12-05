import java.util.ArrayList;

public class test{
    public static void main(String[] args) {
        
        ArrayList<Integer[]> nums = new ArrayList<Integer[]>(); 
        Integer[] arr = {42,31,15,18,39,23,19,83};

        nums.add(arr);
        nums.sort(null);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums.get(i));
        }
    }
}