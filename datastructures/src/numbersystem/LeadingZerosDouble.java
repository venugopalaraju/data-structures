package numbersystem;

import java.text.DecimalFormat;

public class LeadingZerosDouble {
    public static void main(String[] args) {
        double value = 123456;

        // Format the double value with leading zeros
        DecimalFormat df = new DecimalFormat("0000000.00"); // Adjust the pattern as needed
        String formattedValue = df.format(value);

        // Print the formatted value
        System.out.println("Formatted value: " + formattedValue);

        double scaledNumber = value / 100;

        // Desired total length for the formatted string (including leading zeros)
        int totalLength = 13; // For example, total length is 10 for "0001234.56"

        // Format the scaled number with leading zeros
        String formattedValue1 = String.format("%0" + totalLength + ".2f", scaledNumber);

        // Print the formatted value
        System.out.println("Formatted value: " + formattedValue1);
    }
}
