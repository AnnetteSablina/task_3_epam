package by.epamtc.task3.task1.runner;

import by.epamtc.task3.task1.arrayActions.ArrayLogic;
import by.epamtc.task3.task1.arrayActions.ValueLogic;
import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.FillArray;
import by.epamtc.task3.utility.NegativeException;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

import java.util.Arrays;


public class Runner {
    public static void main(String... args) {
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        try {
            FillArray.FillValueFromConsole(arr);
            FillArray.FillValueFromConsole(arr1);
        } catch (ZeroException | NegativeException e) {
            e.printStackTrace();
        }
        Array array = new Array(arr);
        Array array1 = new Array(arr1);
        Array array2 = new Array(arr2);
        try {
            int min = ValueLogic.findMaxValue(array.getArray());
            int max = ValueLogic.findMaxValue(array.getArray());
            int index = ValueLogic.binarySearch(array.getArray(), 0, 0, array.getArray().length);
            System.out.println(min + " " + max + " " + index);
        } catch (NullException | ZeroException e) {
            e.printStackTrace();
        }
        try {
            int[] digitArray = ArrayLogic.findThreeDigitNumberWithDifferentDigit(array.getArray());
            int[] primeArray = ArrayLogic.findPrimeValues(array.getArray());
            int[] fibonacciArray = ArrayLogic.findFibonacciNumbers(array.getArray());
            Arrays.stream(digitArray).forEach(System.out::println);
            Arrays.stream(primeArray).forEach(System.out::println);
            Arrays.stream(fibonacciArray).forEach(System.out::println);
        } catch (NullException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(array1.bubbleSort().toString() + "\n");
            System.out.println(array1.selectionSort().toString() + "\n");
            System.out.println(array1.shuttleSort().toString() + "\n");
        } catch (ZeroException | NullException e) {
            e.printStackTrace();
        }
    }
}
