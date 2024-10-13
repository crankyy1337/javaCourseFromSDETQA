package session3;

public class AssignmentOperators {
    public static void main(String[] args) {

        //assignment (=, +=, -=, *=, /=, %=)

        int a = 10;
        a += 5;       //a = a + 5
        System.out.println(a);      //15
        a -= 7;        //a = a - 5
        System.out.println(a);      //8

        int b = 10;
        b *= 2;     //b = b * 2
        System.out.println(b);      //20
        b /= 5;     //b = b / 5
        System.out.println(b); //4
        b %= 2;     //b = b % 2
        System.out.println(b);      //0
        int c = 20;
        c %= 3;     //c = c % 3
        System.out.println(c);      //2

    }
}
