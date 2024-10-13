package session3;

public class DecrementOperator {
    public static void main(String[] args) {

        // -- called decrement operator

        int a = 10;
        System.out.println(a);      //10
        a--;        //a=a-1;
        System.out.println(a);      //9

        //post decrement

        int b = 100;
        System.out.println(b);      //100
        int resPostDec = b--; //ПОСТ ДЕКРЕМЕНТ. в данном случае декремент происходит после присваивания, поэтому после выполнения данной строчки res = 100, а b = 99
        System.out.println(resPostDec);        //100
        System.out.println(b);      //99

        //pre decrement

        int c = 100;
        System.out.println(c);      //100
        int resPreDec = --c; //ПРЕ ДЕКРЕМЕНТ. в данном случае декремент происходит перед присваиванием, поэтому после выполнения данной строчки res = 99 и c = 99
        System.out.println(resPreDec);        //99
        System.out.println(c);      //99

    }
}
