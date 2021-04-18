package by.epamtc.task3.task1.arrayAction;


import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.task1.sort.SelectionSort;
import by.epamtc.task3.utility.NullException;

public class ValueLogic {
    public static int binarySearch(Array array,int requiredValue) throws NullException {
        array.sort(new SelectionSort());
        int[] arr = array.copy();
        if (arr == null) throw new NullException("Array is null");
        int index = -1;
        int first = 0;
        int last = arr.length;
        while ( first  <= last) {
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
    public static int findMaxValue(Array array) throws NullException {
        int [] arr = array.copy();
        if (arr == null) throw new NullException("Array is null");
        int maxValue = arr[0];
        for (int i : arr) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }
    public static int findMinValue(Array array) throws NullException {
        int [] arr = array.copy();
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

