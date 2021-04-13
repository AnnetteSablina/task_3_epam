package by.epamtc.task3.task2.runner;

import by.epamtc.task3.task2.entityAction.JuggedArraySort;
import by.epamtc.task3.task2.service.PrintArray;

public class Runner {
    public static void main (String...args){
        int[][]arr = new int[][]{{1, 2, 2, 6},
                {3, 18,4,5},
                {4, 23, 4, 4, 8, 4, 4, 5, 25},
                {3000},
                {23, 50, 6, 5, 5}};
        JuggedArraySort.sortMinRowValue(arr);
        PrintArray.printArray(arr);
        JuggedArraySort.sortMaxRowValue(arr);
        PrintArray.printArray(arr);
        JuggedArraySort.sortArrayRowSum(arr);
        PrintArray.printArray(arr);
    }
}