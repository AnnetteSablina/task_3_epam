package by.epamtc.task3.task2.comparator;

import by.epamtc.task3.task2.service.ArrayService;
import by.epamtc.task3.utility.NullException;

import java.util.Comparator;

public class MaxRowSummaComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] arr1, int[] arr2) {
        int firstArrayRowSum = 0;
        try {
            firstArrayRowSum = ArrayService.countSum(arr1);
            int secondArrayRowSum = ArrayService.countSum(arr2);
            return firstArrayRowSum - secondArrayRowSum;
        } catch (NullException e) {
            e.printStackTrace();
            return 0;
        }

    }
}
