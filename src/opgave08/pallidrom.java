package opgave08;

import java.util.Scanner;

public class pallidrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et heltal for at se om det er et Pallidrom tal: ");
        int number = input.nextInt();
        String pallidrom = String.valueOf(number);
        String reverse = new StringBuilder(pallidrom).reverse().toString();
        int check = Integer.parseInt(reverse);
        if (number == check) {
            System.out.printf("Tallet " + number + " er et pallidrom tal");
        } else {
            System.out.println("Tallet " + number + " er ikke et pallidrom tal");
        }

    }
}
