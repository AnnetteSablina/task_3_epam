package by.epamtc.task3.task1.sort;

import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;

public class BubbleSort implements Sortable {
    @Override
    public void sort(Array array) throws NullException {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int index = 1; index < array.getArrayLength(); index++) {
                if (array.getValue(index) < array.getValue(index-1)) {
                    array.swap(index, index - 1);
                    needIteration = true;
                }
            }
        }

    }
}
