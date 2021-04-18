package by.epamtc.task3.task2.runner;

import by.epamtc.task3.task2.comparator.MaxValueInRowComparator;
import by.epamtc.task3.task2.sort.JuggedArraySort;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.PrintArray;

public class Runner {
    public static void main (String...args) throws NullException {
        int[][]arr = new int[][]{{1, 2, 2, 6},
                {3, 18,4,5},
                {4, 23, 4, 4, 8, 4, 4, 5, 25},
                {3000},
                {23, 50, 6, 5, 5},
                {18,30,48,500,9}};
        JuggedArraySort.sort(arr,new MaxValueInRowComparator(),true);//можно выбрать любой другой тип сортировки
        PrintArray.printArray(arr);
    }
}