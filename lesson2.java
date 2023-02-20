package lesson2;

public class lesson2 {
    public static void main(String[] args ){

        System.out.println(summ(5,5));
        System.out.println(summ(8,10));

        System.out.println(PositiveorNegative(4));
        System.out.println(PositiveorNegative(-6));

        System.out.println(PosorNeg(5));
        System.out.println(PosorNeg(-6));

    }

    private static boolean summ (int a, int b){
        int c = a + b;
        return c > 10 && c <= 20 ;
    }
    private static boolean PositiveorNegative(int a){
        if (a<0){
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Положительное");
        }

        return a<0;
    }
    private static boolean PosorNeg (int a){
        return a < 0;
    }

    private
}
