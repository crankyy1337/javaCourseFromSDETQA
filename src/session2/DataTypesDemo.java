package session2;

public class DataTypesDemo {
    public static void main(String[] args) {

        //Numeric

        int a = 100, b = 200;
        System.out.println("the value of a is: " + a);
        System.out.println("the value of a is: " + b);
        System.out.println("the sum of a and b is: " + a + b);
        System.out.println("the sum of a and b is: " + (a + b));

        byte by = 125;
        System.out.println(by);

        short sh = 3535;
        System.out.println(sh);

        long l = 1234567879L;       //literal L is needed
        System.out.println(l);

        //Decimal

        float fl = 15.5F;       //literal F is needed
        System.out.println(fl);

        double dbl = 123.11235123;
        System.out.println(dbl);

        //Other

        char ch = 'A';      //valid
        System.out.println(ch);

        String str = "George";      //valid
        System.out.println(str);

//        char ch = 'ABC';        //invalid
//        char ch = 'B';      //valid
//        String ch = 'ABC';      //invalid
//        String ch = 'A';        //invalid
//        String str = "A";       //valid


        boolean bool = true;        //true/false only
        System.out.println(bool);



    }
}
