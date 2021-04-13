package by.epamtc.task3.utility;


import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FillArray {
    public static int[] FillWithRandomValue(int[] arr) throws ZeroException {
        if (arr.length == 0) throw new ZeroException("The size of the array is 0");
        Random random = new Random();
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(100) - 50;
        }
        return arr;
    }

    public static int[] FillValueFromFile(String fileName) throws IOException {
        fileName = fileName + ".txt";
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        int arraySize = FileActions.countLines(fileName);
        int[] arr = new int[arraySize];
        for (int index = 0; scanner.hasNextInt(); index++) {
            arr[index] = scanner.nextInt();
        }
        fileReader.close();
        return arr;
    }

    public static int[] FillValueFromConsole(int[] arr) throws ZeroException, NegativeException {
        if (arr.length == 0) throw new ZeroException("The size of the array in 0");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = EnterIntegerValue.enterValue("Enter the " + Integer.toString(index + 1)
                    + " value of the array", Mode.ANY);
        }
        return arr;
    }
}
