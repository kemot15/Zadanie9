package Zad4;

import java.util.Arrays;

public class ArrayComparator {
    public static boolean compare (int[] array1, int[] array2){
        if (array1 != null && array2 != null && lenghtCheck(array1, array2)) {
                for (int i = 0; i < array1.length; i++){
                    if (array1[i] != array2[i]) {
                        return false;
                    }
                }
        }else{
            return false;
        }
        return true;
    }

    public static boolean compare (int[][] array1, int[][] array2) {
        if (array1!=null && array2 != null && lenghtCheck(array1, array2)) {
                for (int i = 0; i < array1.length; i++){
                    if (!compare(array1[i], array2[i]))
                        return false;
                }
        }else{
            return false;
        }
            return true;
    }

    public static void showInfo (boolean result){
        System.out.println("Tablice sa " + (result?"rowne":"rozne albo puste"));
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
