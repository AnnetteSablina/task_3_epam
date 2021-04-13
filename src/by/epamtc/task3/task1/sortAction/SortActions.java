package by.epamtc.task3.task1.sortAction;

import by.epamtc.task3.utility.NullException;

public class SortActions {
    public static void swap(int[] array, int ind1, int ind2) throws NullException {
        if (array == null) throw new NullException("Array is null");
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
