package Problem;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String reverseInput = "";

        System.out.print("Enter a word: ");
        String input = scan.nextLine();
        
        for (int i = 0; i < input.length(); i++) {
            reverseInput = input.charAt(i) + reverseInput;
        }

        String output = (input.equals(reverseInput)) ? "Palindrome" : "Not Palindrome";
        System.out.println(output);
    }
}
