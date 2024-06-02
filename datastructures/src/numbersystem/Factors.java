package numbersystem;

public class Factors {
    public static void main(String[] args) {
        printFactorsOfNumber(50);
        System.out.println();
        printFactorsOfNumber2(50);
    }

    private static void printFactorsOfNumber2(int n) {
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==1){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    private static void printFactorsOfNumber(int n) {
        for (int i=1; i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
