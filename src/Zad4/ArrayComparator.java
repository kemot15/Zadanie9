package Zad4;

public class ArrayComparator {
    private static boolean result = true;
    public static boolean compare (int[] array1, int[] array2){
        if (array1.length == array2.length && array1.length > 0 && array2.length > 0){
            for (int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    result = false;
                    return result;
                }
            }
        }else{
            result = false;
            return result;
        }
        return true;
    }

    public static boolean compare (int[][] array1, int[][] array2) {
        int var = 0;
        for (int i = 0; i < array1.length; i++){
            compare(array1[i], array2[i]);
        }
            return result;
    }

    public static void showInfo (boolean result){
        System.out.println("Tablice sa " + (result?"rowne":"rozne albo puste"));
    }
}
