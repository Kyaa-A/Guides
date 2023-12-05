package Problem;
import java.util.Scanner;

public class Frames {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int frame = 1000;
        int video = frame * 24;

        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        int result = (input % 2 == 0)? 0 : video * input;
        System.out.println(result); 

    }
}
