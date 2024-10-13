package session3;

public class IncrementOperator {
    public static void main(String[] args) {

        // ++ called increment operator

        int a = 10;
        System.out.println(a);      //10
        a++;        //a=a+1;
        System.out.println(a);      //11

        //post increment

        int b = 10;
        System.out.println(b);      //10
        int resPostInc = b++; //ПОСТ ИНКРЕМЕНТ. в данном случае инкремент происходит после присваивания, поэтому после выполнения данной строчки res = 10, а b = 11
        System.out.println(resPostInc);        //10
        System.out.println(b);      //11

        //pre increment

        int c = 10;
        System.out.println(c);      //10
        int resPreInc = ++c; //ПРЕ ИНКРЕМЕНТ. в данном случае инкремент происходит перед присваиванием, поэтому после выполнения данной строчки res = 11 и c = 11
        System.out.println(resPreInc);        //11
        System.out.println(c);      //11

    }
}
