package leetcodepatterns.twopointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidaPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isValidaPalindrome("race a car"));
        System.out.println(isValidaPalindrome("No 'x' in Nixon"));
        System.out.println(isValidaPalindrome(" "));
    }

    private static boolean isValidaPalindrome(String s) {
        int left = 0; int right = s.length()-1;
        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
