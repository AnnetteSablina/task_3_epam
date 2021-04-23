package by.epamtc.task3.task2.sort;

import by.epamtc.task3.utility.NullException;

import java.util.Comparator;

public class JuggedArraySort {
    public static void sort(int[][] jaggedArray, Comparator<int[]> comparator, boolean reversed) throws NullException {
        if (jaggedArray == null) throw new NullException("Array is null");
        for (int[] value : jaggedArray) {
            if (value == null) throw new NullException("Subarray is null");
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                if (comparator.compare(jaggedArray[i], jaggedArray[j]) > 0 && !(reversed)
                        ||comparator.compare(jaggedArray[i], jaggedArray[j] ) < 0 && (reversed)){
                    int[] tmp = jaggedArray[i];
                    jaggedArray[i] = jaggedArray[j];
                    jaggedArray[j] = tmp;
                }
              

            }
        }
    }


}
