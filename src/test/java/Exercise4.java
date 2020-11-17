public class Exercise4 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println(subs(a=5,b=3)+subs(a=21,b=5));


        System.out.println(mult(19,3));
        System.out.println(mult(10,3)-subs(12,6));
        System.out.println(mult(subs(20,10),20));
        System.out.println(add(subs(30,15),mult(2,10)));
    }

    

    //add subs method:
    public static int subs(int a, int b) {
        int c = a - b;
        return c;
    }
    public static int mult(int a, int b) {
        int c = a * b;
        return c;


    }
    public static int add(int a, int b) {
        int c = a + b;
        return c;


    }


}