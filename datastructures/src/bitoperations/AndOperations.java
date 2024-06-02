package bitoperations;

public class AndOperations {

    public static void main(String[] args) {
        System.out.println("number 5 is odd ? "+isOdd(5));
        System.out.println("number 6 is odd ? "+isOdd(6));
        System.out.println("find findNthBitOfNumberOfA : 5,3 :: "+findNthBitOfNumberOfA(5,3));
    }
    public static boolean isOdd(int number){
        //If least significant bit is 1 then it s odd else even
        return (number & 1) == 1;
    }

    public static int findNthBitOfNumberOfA(int a,int n){
        return a & (1<<(n-1));
    }
}
