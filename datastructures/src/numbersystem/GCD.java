package numbersystem;

//GCD (Greatest Common Divisor)/HCF (Highest Common Factor)
public class GCD {
    public static void main(String[] args) {
        System.out.println(getGCD(12,16));
        System.out.println(getGCDUsingEucliclean(12,16));
        System.out.println(getGCDUsingEuclicleanOptimized(12,16));
    }

    public static int getGCDUsingEuclicleanOptimized(int a, int b) {
        if(b==0) return a;
        /*12,16
        * 16,12
        * 12,4
        * 4,0
        * 4*/
        return getGCDUsingEuclicleanOptimized(b,a%b);
    }

    private static int getGCDUsingEucliclean(int a, int b) {
        //12,15
        //12,3
        //9,3
        //6,3
        //3,3
        //result 3
        while (a!=b){
            if(a>b){
                a = a-b;
            }else{
                b= b-a;
            }
        }
        return a;
    }

    private static int getGCD(int a, int b) {
        int result = Math.min(a, b);
        while (result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
}
