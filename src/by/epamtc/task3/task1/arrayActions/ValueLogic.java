package by.epamtc.task3.task1.arrayActions;


import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

public class ValueLogic {
    public static int binarySearch(int [] arr,int requiredValue,int first,int last) throws NullException, ZeroException {
        if (arr == null) throw new NullException("Array is null");
        Array array = new Array (arr);
        arr = array.selectionSort().getArray();
        int index = -1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if(arr[middle] < requiredValue) {
                first = middle + 1;
            } else if (arr[middle] > requiredValue) {
                last = middle - 1;
            } else if (arr[middle] == requiredValue) {
                index = middle;
                break;
            }
        }
        return index;
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

