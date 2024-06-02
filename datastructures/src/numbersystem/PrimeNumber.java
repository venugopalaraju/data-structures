package numbersystem;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = isPrime(12);
        for (int i =1;i<15;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }

    private static boolean isPrime(int n) {
        if (n==1) return false;
        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
