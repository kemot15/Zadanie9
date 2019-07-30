package Zad1;

import java.util.Random;

public class Array {
    private static int size = 10;

    public static int[] generateArray (){
        Random random = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i <size; i++){
            randomArray[i] = random.nextInt(20); //ograniczenie dla latwiejszego sprawdzania wynikow
        }
        return randomArray;
    }

    public static void reverseArray (int[] array){
        String part1 = "";
        String part2 = "";
        for (int i = 0; i < array.length; i++){
            part1 += array[i] + " ";
            part2 += array[array.length-i-1] + " ";
        }
        System.out.println(part1 + part2);
    }
}
