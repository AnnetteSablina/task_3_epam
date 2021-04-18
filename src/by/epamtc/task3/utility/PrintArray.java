package by.epamtc.task3.utility;

public class PrintArray {
    public static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
