package by.epamtc.task3.task2.entityAction;

import by.epamtc.task3.task2.service.CompareService;
import by.epamtc.task3.task2.service.CompareType;
import by.epamtc.task3.utility.NullException;

public class JuggedArraySort {
    private static void bubbleSort(int[][] jaggedArray, CompareType type) throws NullException {
        if (jaggedArray == null) throw new NullException("Array is null");
        for (int[] value : jaggedArray) {
            if (value == null) throw new NullException("Subarray is null");
        }
        boolean isNeedReverse = true;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                isNeedReverse = true;
                if (type == CompareType.MAXROWSUMMA && (CompareService.compareArrayRowSum(jaggedArray[i], jaggedArray[j]) > 0)) {
                    isNeedReverse = false;
                }
                if (type == CompareType.MAXVALUE && (CompareService.compareMaxRowValue(jaggedArray[i], jaggedArray[j]) > 0)) {
                    isNeedReverse = false;
                }
                if (type == CompareType.MINVALUE && (CompareService.compareMinRowValue(jaggedArray[i], jaggedArray[j]) < 0)) {
                    isNeedReverse = false;
                }
                if (isNeedReverse) {
                    int[] tmp = jaggedArray[i];
                    jaggedArray[i] = jaggedArray[j];
                    jaggedArray[j] = tmp;
                }
            }
        }
    }
    public static void sortArrayRowSum(int[][]jaggedArray){ //по увеличению суммы (от меньшей к большей)
        try {
            bubbleSort(jaggedArray,CompareType.MAXROWSUMMA);
        } catch (NullException e) {
            e.printStackTrace();
        }
    }
    public static void sortMaxRowValue(int[][]jaggedArray){//по возрастанию максимальных элементов
        try {
            bubbleSort(jaggedArray,CompareType.MAXVALUE);//по убыванию минимаьных элементов
        } catch (NullException e) {
            e.printStackTrace();
        }
    }
    public static void sortMinRowValue(int[][]jaggedArray) {
        try {
            bubbleSort(jaggedArray, CompareType.MINVALUE);
        } catch (NullException e) {
            e.printStackTrace();
        }
    }

}
