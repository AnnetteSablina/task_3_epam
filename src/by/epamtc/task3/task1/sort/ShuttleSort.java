package by.epamtc.task3.task1.sort;

import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

public class ShuttleSort implements Sortable{
    @Override
    public void sort(Array array) throws NullException {
        for (int index = 1; index < array.getArrayLength(); index++) {
            if (array.getValue(index) < array.getValue(index-1)) {
               array.swap(index, index - 1);
                for (int z = index - 1; z >= 0; z--) {
                    if (array.getValue(z) < array.getValue(z-1)) {
                        array.swap(z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
