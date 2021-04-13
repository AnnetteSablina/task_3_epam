package by.epamtc.task3.task2.service;

import by.epamtc.task3.utility.NullException;

public class ArrayService {

    public static int countSum (int[] arr) throws NullException {
        if (arr == null ) throw new NullException("Array is null");
        int summa = 0;
        for (int i:arr){
            summa += i;
        }
        return summa;
    }
    public static int findMaxValue(int [] arr) throws NullException {
        if (arr == null) throw new NullException("Array is null");
        int maxValue = arr[0];
        for (int i : arr) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }
    public static int findMinValue(int [] arr) throws NullException {
        if (arr == null) throw new NullException("Array is null");
        int minValue = arr[0];
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

}
