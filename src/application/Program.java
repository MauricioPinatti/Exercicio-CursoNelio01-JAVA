package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle x;
        x = new Rectangle();


        System.out.println("Enter rectangle Width and Height: ");
        x.Width = sc.nextDouble();
        x.Height = sc.nextDouble();

        double area = x.area();
        System.out.printf("AREA = %.2f%n", x.area());

        double perimeter = x.perimeter();
        System.out.printf("PERIMETER = %.2f%n", x.perimeter());

        double diagonal = x.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", x.diagonal());

    }
}
