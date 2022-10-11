package javahomeworkweek_6;

import java.util.Scanner;

public class Decimal_binary_Q17 {
    public static void main(String[] args) {

        Scanner tej = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        int a = tej.nextInt();
        System.out.println("Binary equivalant of " +a+" is: ");
        System.out.println(Integer.toBinaryString(a));

        System.out.print("Enter Binary Number: ");
        String b = tej.next();
        System.out.print("Decimal equivalent of "+b+" is:  ");
        System.out.println(Integer.parseInt(b,2));

    }
}
