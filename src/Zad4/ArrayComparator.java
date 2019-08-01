package Zad4;

import java.util.Arrays;

public class ArrayComparator {
    ///private static boolean result = true;
    public static boolean compare (int[] array1, int[] array2){
        if (isNotNull(array1) && isNotNull(array2)) {
            if (lenghtCheck(array1, array2)){
                for (int i = 0; i < array1.length; i++){
                    if (array1[i] != array2[i]) {
                        //result = false;
                        return false;
                    }
                }
            }else{
               // result = false;
                return false;
            }
        }else{
           // result = false;
            return false;
        }

        return true;
    }

    public static boolean compare (int[][] array1, int[][] array2) {
        if (isNotNull(array1) && isNotNull(array2)) {
            if (lenghtCheck(array1, array2)) {
                for (int i = 0; i < array1.length; i++){
                    return compare(array1[i], array2[i]);
                }
            } else {
               // result = false;
                return false;
            }
        }else{
            //result = false;
            return false;
        }
            return true;
    }

    public static void showInfo (boolean result){
        System.out.println("Tablice sa " + (result?"rowne":"rozne albo puste"));
    }

    public static boolean isNotNull (int[] array){
        if (Arrays.toString(array) != "null")
            return true;
        else return false;
    }

    public static boolean isNotNull (int[][] array){
        if (Arrays.toString(array) != "null")
            return true;
        else return false;
    }

    public static boolean lenghtCheck (int[] tab1, int[] tab2){
        if (tab1.length == tab2.length)
            return true;
        else return false;
    }

    public static boolean lenghtCheck (int[][] tab1, int[][] tab2){
        if (tab1.length == tab2.length)
            return true;
        else return false;
    }
}
