package opgave06;

import java.util.Scanner;

public class tværsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et heltal som du vil have tværsummen af: ");
        int tværsum = input.nextInt();
        int test = 1;
        int hold = 1;

        while (test != 0) {
            test = (tværsum/hold) % 10;
            hold += 1;

        }
        System.out.println(hold);
    }
}
