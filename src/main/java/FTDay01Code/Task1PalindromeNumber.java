package FTDay01Code;

public class Task1PalindromeNumber {

    /*
     * Palindrome Number
     * 
     * Create a program that will check if the given number is palindrome.
     * A number is palindrome if the digits are the same read forwards and
     * backwards.
     * "Do not use a String"
     * 
     * Ex:
     * Given n = 1234321 -> palindrome
     * Given n = 15651 -> palindrome
     * Given n = 18374 -> not palindrome
     * Given n = 1264628 -> not palindrome
     */

    public static void PalindromeNumber(int randomNumber) {
        int reverse = 0;
        int remainder = 0;
        int original = randomNumber;

        while (randomNumber != 0) {
            remainder = randomNumber % 10;
            reverse = reverse * 10 + remainder;
            randomNumber = randomNumber / 10;
        }

        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber(1234321);
        PalindromeNumber(15651);
        PalindromeNumber(18374);
        PalindromeNumber(1264628);
    }
}
