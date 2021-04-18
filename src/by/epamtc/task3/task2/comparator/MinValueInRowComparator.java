package by.epamtc.task3.task2.comparator;

import by.epamtc.task3.task2.service.ArrayService;
import by.epamtc.task3.utility.NullException;

import java.util.Comparator;

public class MinValueInRowComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] arr1, int[] arr2) {
        int firstMaxRowValue = 0;
        try {
            int firstMinRowValue = ArrayService.findMinValue(arr1);
            int secondMinRowValue = ArrayService.findMinValue(arr2);
            return firstMinRowValue - secondMinRowValue;
        } catch (NullException e) {
            e.printStackTrace();
            return 0;
        }

    }
}
