public class Exercise3 {


    public static void main(String[] args) {
        double a;
        double b;

        division( 9,2);
        division(20, 5);
        division(124,26);
    }


    //add division method:
    public static void division(double a, double b) {
        double c = a / b;
        System.out.println("the division of " + a + " per " + b + " is equal to:" + c);

    }

    }
