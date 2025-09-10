package opgave05;

public class loops {
    public static void main(String[] args) {
        //System.out.println(starFig1());
        System.out.println(starFig2());
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

    public static String starFig2(){
        int counter = 0;
        int test;
        int star = 5;
        String result = "*";

        while (counter < star){
            test = star;
            while (test <= 5){

            }
        }

        return result;
    }
}
