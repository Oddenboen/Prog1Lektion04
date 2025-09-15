package opgave07;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et heltal, for at få bytte cifrene om: ");
        int number = input.nextInt();
        String text = String.valueOf(number);
        String reverse = new StringBuilder(text).reverse().toString();
        int numberprint = Integer.parseInt(reverse);
        System.out.println(numberprint);


    }
}
