package numbersystem;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(10));  //TC: O(n)  SC: Theta(n)
        System.out.println(fact1(10)); //TC: O(n)  SC: Theta(1)
        System.out.println(fact(1));
        System.out.println(fact1(1));
        System.out.println(fact(100));
        System.out.println(fact1(100));
        System.out.println(fact(0));
        System.out.println(fact1(0));
        System.out.println(fact(-1));
        System.out.println(fact1(-1));
    }

    private static BigInteger fact(int input) {
        if(input<=0){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(input).multiply(fact(input-1));
    }

    private static BigInteger fact1(int input) {
        BigInteger result= BigInteger.ONE;
        for (int i=1;i<=input;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
