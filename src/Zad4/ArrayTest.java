package Zad4;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] tab1 =  {1,2,3,4,5};//null;// {1,2,3,4,5};//
        int[] tab2 = {1,2,3,4,5};
        int[][] tab3 = {{1,2},{1,2},{1,2}};
        int[][] tab4 = {{1,2},{1,2}};//null;
        ArrayComparator.showInfo(ArrayComparator.compare(tab1, tab2));
        ArrayComparator.showInfo(ArrayComparator.compare(tab3, tab4));
    }
}
