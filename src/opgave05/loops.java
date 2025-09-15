package opgave05;

public class loops {
    public static void main(String[] args) {
        System.out.println(starFig1() + "\n");
        System.out.println(starFig2());
        System.out.println(starFig3());
        System.out.println(starFig4());
    }

    public static String starFig1() {
        int counter = 0;
        String result = "";

        while (counter < 5) {
            System.out.println(result);
            result += "*";
            counter++;
        }

        return result;
    }


    public static String starFig2() {
        int counter = 5;
        int i = 0;
        int j = 5;
        String result = "";

        while (counter > 0) {
            while (i < j) {
                System.out.print("*");
                i++;
            }
            System.out.println("");

            counter--;
            i = 0;
            j--;
        }
        return result;
    }

    public static String starFig3() {
        int counter = 0;
        int i = 4;
        int j = 0;
        int n = 1;
        int g = 0;

        while (counter < 5) {
            while (i > j) {
                System.out.print(" ");
                j++;
            }
            while (n > g) {
                System.out.print("*");
                g++;
            }

            System.out.println();

            n++;
            g = 0;
            j = 0;
            i--;
            counter++;
        }

        return "";
    }

    public static String starFig4() {
        int counter = 0;
        int i = 5;
        int j = 0;
        int n = 0;
        int g = 0;

        while (counter < 5) {
            while (n > g) {
                System.out.print(" ");
                g++;
            }
            while (i > j) {
                System.out.print("*");
                j++;
            }


            System.out.println();

            n++;
            g = 0;
            j = 0;
            i--;
            counter++;
        }

        return "";
    }
}
