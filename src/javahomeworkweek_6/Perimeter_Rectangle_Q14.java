package javahomeworkweek_6;


import java.util.Scanner;

public class Perimeter_Rectangle_Q14 {
    public static void main(String[] args) {
        // a,b is width and height this is rectangle sides should be length and breath
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter Value for Width/length of Rectangle");
        double Width = tej.nextDouble();
        System.out.println("Enter Value for Height/breath of Rectangle");
        double Height = tej.nextDouble();
        tej.close();
        System.out.println( "Width="  +Width +  "Height=" +Height);
        double areaofrectangle = Width  *  Height;
        System.out.println("Area of Rectangle ="+areaofrectangle);
        double perimeter = Width+Height/2;
        System.out.println("Perimeter of Rectangle =" +perimeter);
        areaofrectangle = Width * Height;
        perimeter = 2 * (Width + Height);
    }
}
