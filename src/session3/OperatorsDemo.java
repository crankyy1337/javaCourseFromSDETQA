package session3;

public class OperatorsDemo {
    public static void main(String[] args) {

        //arithmetic (+, -, *, /, %)

        int a = 23, b = 10;
        System.out.println("Sum of a and b is: "+ (a + b));
        System.out.println("Diff of a and b is: "+ (a - b));
        System.out.println("Multiplication of a and b is: "+ (a * b));
        System.out.println("Division of a and b is: "+ (a / b));        //вернет только целую часть
        System.out.println("Modulo division of a and b is: "+ (a % b));     //вернет только остаток от деления
        int resArithmetic = a+b;      //тип данных в результирующей переменной должен совпадать с типом данных в операции
        System.out.println("Sum of a and b is: "+resArithmetic);

        //comparison (>, <, >=, <=, !=, ==)
        //always returns boolean value (true/false)
        //works with all data types (int, string, boolean etc)

        System.out.println(a > b);      //true
        System.out.println(a < b);      //false
        System.out.println(a >= b);     //true
        System.out.println(a <= b);     //false
        b = 23;     //тип данных был определен ранее, меняем только значение в переменной
        System.out.println(a <= b);     //true
        System.out.println(a >= b);     //true
        System.out.println(a != b);     //false
        System.out.println(a == b);     //true
        boolean resCompatison = a > b;
        System.out.println(resCompatison);

        //logical (&&, ||, !)
        //always returns boolean value (true/false)
        //works only with boolean variables
/*      EXAMPLE
        ___________________________________________
        |   x    |   y   |  x&&y  | x||y   |  !x   |
        |--------|-------|--------|--------|-------|
        |  true  | true  |  true  | true   | false |
        |  true  | false |  false | true   | false |
        |  false | true  |  false | true   | false |
        |  false | false |  false | false  | false |
 */
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);     //false
        System.out.println(x || y);     //true
        System.out.println(!x);     //false
        System.out.println(!y);     //true

        boolean b1 = 10 > 20;
        System.out.println(b1);     //false

        boolean b2 = 20 > 10;
        System.out.println(b2);     //true

        System.out.println(b1 && b2);       //false
        System.out.println( b1 || b2);      //true

        //can combine comparison and logical operators
        System.out.println((10<20) && (20>10)); //true
    }
}
