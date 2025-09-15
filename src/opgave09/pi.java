package opgave09;

import java.util.Scanner;

public class pi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast et tal der indikere præcisionen af approksimeringen: ");
        int counter = input.nextInt();
        double pi;
        double parameter = 0;
        double x = 1;
        int i = 1;

        while (i <= counter) {
            parameter += (Math.pow(-1, x + 1) / (2 * x - 1));
            x++;
            i++;
        }
        pi = 4 * parameter;
        System.out.println("Pi er approksimativt " + pi);

    }
}
