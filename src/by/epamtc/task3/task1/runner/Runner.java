package by.epamtc.task3.task1.runner;



import by.epamtc.task3.task1.arrayAction.ArrayLogic;
import by.epamtc.task3.task1.arrayAction.ValueLogic;
import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.task1.sort.BubbleSort;
import by.epamtc.task3.utility.NullException;

import java.util.Arrays;

public class Runner {
    public static void main(String... args) throws NullException {
        int[] arr = {1,2,8,21,14,112,122,121,999,5,47,6,123};
        Array array = new Array(arr);
        array.sort(new BubbleSort()); // можно выбрать лбую другую сортировку
        System.out.println(array); // вывод на консоль
        int [] fib = ArrayLogic.findFibonacciNumbers(array);// получение массива чисел фиббоначи (можно любые другие поиски)
        Arrays.stream(fib).forEach(System.out::println);
        int min = ValueLogic.findMinValue(array);//любой другой поиск
        System.out.println(min);
    }
}
