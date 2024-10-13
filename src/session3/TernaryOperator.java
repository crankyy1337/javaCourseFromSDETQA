package session3;

public class TernaryOperator {
    public static void main(String[] args) {

        //syntax var = exp ? result1 : result2

        int a = 200, b = 100;
        int x = (a > b) ? a : b;
        System.out.println(x);

        int y = (1==1) ? 100 : 200;
        System.out.println(y);

        int person_age = 30;
        String is_adult = (person_age >= 18) ? "Adult" : "Child";
        System.out.println(is_adult);

    }
}
