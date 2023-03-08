package Lesson3;

import java.util.Arrays;

public class Lesson3Task2 {
    public static void main(String[] args) {
        int[] array100 = new int[100];
        for (int i= 0; i<array100.length; i++) {
            array100[i]= i+1;
        }
        System.out.println(Arrays.toString(array100));
    }
}
