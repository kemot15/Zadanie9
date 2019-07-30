package Zad2;

public class Calculator {
    public static int sum (int number){
        String numString = Integer.toString(number);
        int newSum = 0;
        for (int i = 0; i < numString.length(); i++){
            newSum += numString.charAt(i)- '0';
        }
        return newSum;
    }
}
