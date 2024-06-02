package bitoperations;

public class MagicNumber {
    public static void main(String[] args) {
        findMagicNumber(3); //011--->(0*5^3)+(1*5^2)+(1*5^1) = 0+25+5 ==> 30
        findMagicNumber(5);
        findMagicNumber(6);
    }

    private static void findMagicNumber(int n) {
        int basic = 5;
        int ans = 0;
        while (n>0){
            int last = n & 1;
            n = n >> 1; //remove to counted bit
            ans+=last*basic;
            basic = basic*5;
        }
        System.out.println(ans);
    }
}
