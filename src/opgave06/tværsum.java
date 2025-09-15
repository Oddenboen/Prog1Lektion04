package opgave06;

import java.util.Scanner;

public class tværsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et heltal som du vil have tværsummen af: ");
        int tværsum = input.nextInt();
        double test = 1;
        int hold = 0;
        double sum = 0;
        int i = 0;

        while (test >= 1) {
            test = (tværsum / Math.pow(10, hold)) % 10;
            hold += 1;
            //sum = sum + test;

        }
        hold--;
        System.out.println(hold);

        while (hold > 0) {
            //sum = sum + (tværsum/Math.pow(10, i)) % 10;
            sum = Math.floor(sum + (tværsum / Math.pow(10, i)) % 10);
            i++;
            hold--;
        }

        System.out.println(sum);


    }
}
