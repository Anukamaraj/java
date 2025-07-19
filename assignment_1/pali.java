import java.util.Scanner;

public class Pali {
    public static void main(String args[]) {
        System.out.println("Enter the number to check palindrome:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        palin(n);
    }

    public static void palin(int num) {
        int a = 0;
        int originalNum = num;  // Store the original number
        
        // Reversing the number
        while (num > 0) {
            int rem = num % 10;
            a = a * 10 + rem;
            num = num / 10;
        }

        // Check if the number is a palindrome
        if (originalNum == a) {
            System.out.println("The number " + originalNum + " is a palindrome.");
        } else {
            System.out.println("The number " + originalNum + " is not a palindrome.");
        }
    }
}
