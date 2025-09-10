package opgave03;

import java.util.*;


public class tabel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal du gerne vil have 10 tabelen af: ");
        int tabel = input.nextInt();
        int counter = 1;
        int display;
        int dummy = tabel;

        while (counter <= 10) {
            display = tabel * counter;
            System.out.printf("%4d",display);
            counter++;
            if (counter > 10 && tabel < 10 + dummy) {
                System.out.println("");
                tabel++;
                counter = 1;
            }
        }


    }
}
