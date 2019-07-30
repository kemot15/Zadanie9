package Zad4;

public class ArrayComparator {
    public static boolean compare (int[] array1, int[] array2){
        boolean result = true;
        if (array1.length == array2.length && array1.length > 0 && array2.length > 0){
            for (int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    return false;
                }
            }
        }else
            return false;
        return true;

    }

    public static boolean compare (int[][] array1, int[][] array2) {
        int var = 0;
        for (int i = 0; i < array1.length; i++){
            if (!compare(array1[i], array2[i]))
                var++;
        }

        if (var==0)
            return true;
        else
            return false;
    }

    public static void showInfo (boolean result){
        System.out.println("Tablice sa " + (result?"rowne":"rozne albo puste"));
    }
}
