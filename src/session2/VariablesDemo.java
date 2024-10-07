package session2;

public class VariablesDemo {
    public static void main(String[] args) {

        int a = 100;        //declaration+assignment
        System.out.println(a); //100

        a = 200;
        System.out.println(a); //200


        //Approach 1

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        //Approach 2

        int a2,b2,c2;
        a2 = 100;
        b2 = 200;
        c2 = 300;

        //Approach 3
        int a3 = 100, b3 = 200, c3 = 300;

        System.out.println("the value of a3: " + a3);
        System.out.println("the value of b3: " + b3);
        System.out.println("the value of c3: " + c3);

        System.out.println(a3+ b3 + c3);        //sum
        System.out.println(a3 + " " + b3 + " " +c3);        //concat

    }
}
