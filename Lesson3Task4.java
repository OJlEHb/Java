package Lesson3;

import java.util.Arrays;

public class Lesson3Task4 {
    public static void main(String[] args){
        int[][] array = new int[4][4];
        for (int i = 0; i< 4;i++){
            for (int j = 0; j< 4; j++){
               if (i == j){
                   array[i][j] = 1;
               }
            }
        }

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }

}
