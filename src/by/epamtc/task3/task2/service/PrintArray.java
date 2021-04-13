package by.epamtc.task3.task2.service;

public class PrintArray {
    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
