package numbersystem;

public class CountDigits {
    public static void main(String[] args) {
        int count = countDigits("789");
        System.out.println(count);
    }

    private static int countDigits(String number) {
        int input = Integer.parseInt(number);
        int count = 0;
        while (input>0){
            input = input/10; //removing last digit
            count++;
        }
        return count;
    }
}
