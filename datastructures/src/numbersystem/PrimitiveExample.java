package numbersystem;

public class PrimitiveExample {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 123;
        long l = 100000L;

        float f = 234.5f;
        double d = 123.4;

        char c = 'A';

        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        int number = 123;
        String formatted = String.format("%07d", i);
        System.out.println("Formatted with leading zeros: " + formatted);  // Output: 0000123

    }
}
