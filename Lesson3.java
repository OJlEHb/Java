package Lesson3;

import java.util.Arrays;

public class Lesson3 {

        public static void main(String[] args){
            int[] arrayinvert = {1,0,1,0,1};
            for (int i = 0; i< arrayinvert.length; i++){
            if (arrayinvert[i] == 1) {
                arrayinvert[i] = 0;
            } else {
                arrayinvert [i] = 1;
            }
            }
            System.out.println(Arrays.toString(arrayinvert));
        }


}
