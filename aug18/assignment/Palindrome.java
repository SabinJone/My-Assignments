package aug18.assignment;

public class Palindrome {

public static void main(String[] args) {

        int number = 12521; // Change this number to test other values

        // Variables for reversing the number
        int originalNum = number;
        int reversedNum = 0;
        int digit;
        
        // Reversing the number
        digit = number % 10;
        reversedNum = reversedNum * 10 + digit;
        number = number / 10;
        
        digit = number % 10;
        reversedNum = reversedNum * 10 + digit;
        number = number / 10;
        
        digit = number % 10;
        reversedNum = reversedNum * 10 + digit;
        number = number / 10;
        
        digit = number % 10;
        reversedNum = reversedNum * 10 + digit;
        number = number / 10;
        
        digit = number % 10;
        reversedNum = reversedNum * 10 + digit;
        number = number / 10;

        // Check if the reversed number is equal to the original number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}




