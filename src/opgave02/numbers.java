package opgave02;

import java.util.*;

public class numbers {
    public static void main(String[] args) {

        int start = 0;
        double qubic = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast maxCounter");
        int maxCounter = input.nextInt();
        input.close();

        System.out.println("Summen af ulige tal er: " + returnsum(start, maxCounter));
        System.out.println("Summen af kvadrat tal er: " + returnqubic(qubic, maxCounter));

    }

    public static int returnsum(int start, int maxCounter) {

        int counter = 1;

        while (counter <= maxCounter) {
            if (counter % 2 == 0) {
                start = start + counter;
            }
            counter++;
        }

        return start;
    }

    public static double returnqubic(double qubic, int maxCounter) {

        double sum = 1;
        double potenssum = 1;

        while (potenssum < maxCounter) {
            qubic = qubic + Math.pow(sum, 2);
            potenssum = Math.pow(sum, 2);

            sum++;
        }

        return qubic;
    }

}
