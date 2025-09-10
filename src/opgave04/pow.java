package opgave04;

import java.util.*;

public class pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv 2 tal, hvor det første opløftes i det andet: ");
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        double sum = 1;
        int counter = 0;

        while (counter < tal2){
            sum = sum * tal1;
            counter++;
        }
        System.out.println(sum);

    }
}
