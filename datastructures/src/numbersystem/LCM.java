package numbersystem;

//Least Common Multiple  (smallest number whivh divisible by both a, b)
public class LCM {
    public static void main(String[] args) {
        //(a*b) = gcd(a,b) * lcm(a,b)
        //lcm(a,b) = (a*b)/gcd(a,b)
        System.out.println(gcm(12,16));
        System.out.println(gcm1(12,16));

    }

    private static int gcm1(int a, int b) {
        int result = Math.max(a, b);
        while (true){
            if(result%a==0 && result%b==0){
                return result;
            }
            result++;
        }
    }

    private static int gcm(int a, int b) {
        return (a*b)/GCD.getGCDUsingEuclicleanOptimized(a,b);
    }
}
