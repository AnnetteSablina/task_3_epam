package by.epamtc.task3.task2.comparator;

import by.epamtc.task3.task2.service.ArrayService;
import by.epamtc.task3.utility.NullException;

import java.util.Comparator;

public class MaxValueInRowComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] arr1, int[] arr2) {
         try {
             int firstMaxRowValue = ArrayService.findMaxValue(arr1);
             int secondMaxRowValue = ArrayService.findMaxValue(arr2);
             return firstMaxRowValue - secondMaxRowValue;
        } catch (NullException e) {
            e.printStackTrace();
            return 0;

        }

    }
}
