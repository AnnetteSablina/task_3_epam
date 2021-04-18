package by.epamtc.task3.task1.sort;

import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;

public class SelectionSort implements Sortable {
    @Override
    public void sort(Array array) throws NullException {
        for (int left = 0; left < array.getArrayLength(); left++) {
            int minIndex = left;
            for (int i = left; i < array.getArrayLength(); i++) {
                if (array.getValue(i) < array.getValue(minIndex)) {
                    minIndex = i;
                }
            }
            array.swap(left, minIndex);
        }
    }
}
