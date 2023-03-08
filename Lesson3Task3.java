package Lesson3;

import java.util.Arrays;

public class Lesson3Task3 {
    public static void main(String[] args) {
        int[] arraymulty2 ={1,3,4,5,23,22,1,2,4};
        for (int i=0; i< arraymulty2.length; i++){
            int value = arraymulty2[i];
            if (value < 6){
                arraymulty2[i]=value*2;
            }
        }
        System.out.println(Arrays.toString(arraymulty2));

    }
}
