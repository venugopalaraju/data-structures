package numbersystem;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-2));
    }

    private static boolean isPalindrome(int input) {
        int reverseNumber = 0;
        int temp = input;
        while (temp>0){
            int lastDigit = temp%10; //3 2 1
            reverseNumber = (reverseNumber*10)+lastDigit; // 0+3 30+2=32 320+1=321
            temp = temp/10; // 12 1 0 (removing last digit)
        }
        return input==reverseNumber;
    }
}
