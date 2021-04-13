package by.epamtc.task3.task2.service;

import by.epamtc.task3.utility.NullException;

public class CompareService  {
    public static int compareArrayRowSum (int [] arr1 , int [] arr2) throws NullException {
        if ( arr1 == null || arr2 == null ) throw new NullException("Array is null");
        int firstArrayRowSum = ArrayService.countSum(arr1);
        int secondArrayRowSum = ArrayService.countSum(arr2);
        return firstArrayRowSum - secondArrayRowSum;
    }
    public static int compareMaxRowValue (int [] arr1 , int [] arr2) throws NullException {
        if ( arr1 == null || arr2 == null ) throw new NullException("Array is null");
        int firstMaxRowValue = ArrayService.findMaxValue(arr1);
        int secondMaxRowValue = ArrayService.findMaxValue(arr2);
        return firstMaxRowValue - secondMaxRowValue;
    }
    public static int compareMinRowValue (int [] arr1 , int [] arr2) throws NullException {
        if ( arr1 == null || arr2 == null ) throw new NullException("Array is null");
        int firstMinRowValue = ArrayService.findMinValue(arr1);
        int secondMinRowValue = ArrayService.findMinValue(arr2);
        return firstMinRowValue - secondMinRowValue;
    }
}