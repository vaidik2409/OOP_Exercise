import java.util.Scanner;

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0); 

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The letter '" + ch + "' is a vowel.");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The letter '" + ch + "' is a consonant.");
        } 
        else {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        }
    }
}
