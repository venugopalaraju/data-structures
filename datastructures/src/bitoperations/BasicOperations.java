package bitoperations;

public class BasicOperations {
    public static void main(String[] args) {
        int x=1;
        System.out.println(~x);
//        0001 -- 1110 --
        System.out.println(5>>1); //101--0010--2
        System.out.println(6>>1); //110--0011--3
        System.out.println(5>>2); //101--0001--1
        System.out.println(6>>2); //110--0001--1

        System.out.println(5<<1); //101--1010--10
        System.out.println(6<<1); //110--1100--12
    }
}
