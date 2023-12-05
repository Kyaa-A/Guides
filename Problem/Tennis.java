package Problem;
import java.util.Scanner;
public class Tennis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int firstPlayer = scan.nextInt();
        int secondPlayer = scan.nextInt();

        int greater = ((firstPlayer > secondPlayer) ? firstPlayer : secondPlayer);
        int result = (greater * 2) - 1;

        System.out.print("Output: " + result + "\n");
    }
}
