package Lesson3;

import java.util.Arrays;

public class Lesson3Task5 {
    public static void main(String[] args){
        int[] array = getNewArray(12,269);
        System.out.println(Arrays.toString(array));
    }
    private static int[] getNewArray(int len, int initialValue){
        int[] array2 = new int[len];
        Arrays.fill(array2,initialValue);
        return array2;
    }
}
