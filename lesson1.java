package lesson1;
     class HomeWorkApp1{
        public static void main(String[] args){
            ThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        public static void ThreeWords(){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        public static void checkSumSign(){
            int a = 5;
            int b = -6;
            int c = a + b;

            if (c>=0) {
                System.out.println("sum is positive");
            }
            else {
                System.out.println("sum is negative");
            }
        }

        public static void printColor(){
            int value = 5;

            if (value <=0) {
                System.out.println("Red");
            }
            if (value >0 && value <=100) {
                System.out.println("Yellow");
            }
            else {
                System.out.println("Green");
            }
        }

        public static void compareNumbers(){
            int a=8;
            int b=7;

            if (a>=b) {
                System.out.println("a>=b");
            }
            else {
                System.out.println("a<b");
            }

        }
    }

