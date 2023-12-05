package Problem;
public class PalindromStringBuilder{
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();
        int x = 1221;
        String strConverted = String.valueOf(x);
        str.append(strConverted);

        String word1 = str.toString();
        String word2 = str.reverse().toString();

        if(word1.equals(word2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}