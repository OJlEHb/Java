package lesson2;

public class lesson2 {
    public static void main(String[] args ){

        System.out.println(summ(5,5));
        System.out.println(summ(8,10));

        PositiveorNegative(4);
        PositiveorNegative(-6);


        System.out.println(PosorNeg(5));
        System.out.println(PosorNeg(-6));

        WriteString("строка 4 раза",4);
        WriteString("строка 5 раз", 5);

        }


    private static boolean summ (int a, int b){
        int c = a + b;
        return c > 10 && c <= 20 ;
    }
    private static void PositiveorNegative(int a){
        if (a<0){
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Положительное");
        }

    }
    private static boolean PosorNeg (int a){
        return a < 0;
    }

    private static void WriteString(String String, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(String);
        }
    }
}
