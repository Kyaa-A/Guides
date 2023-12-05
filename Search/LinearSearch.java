package Search;
public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[] = {4, 9, 21, 42, 99};
        int target = 99;
        int result = linearSearch(arr, target);
        System.out.println(result);
       
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num == target){
                System.out.println("Target index located: " + i); 
                return num;
            }
        }
        return -1;
    }
}
