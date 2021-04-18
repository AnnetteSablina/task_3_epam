package by.epamtc.task3.task1.arrayAction;

import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;

public class ArrayLogic {
    public static int[] findPrimeValues(Array array) throws NullException {
        int[] arr = array.copy();
        if (arr == null) throw new NullException("Array is null");
        int[] primeArray = new int[arr.length];
        int primeIndex = -1;
        int primeNumberCount = 0;
        for (int i : arr) {
            boolean isPrime = true;
            if (i == 1 || i <= 0) {
                isPrime = false;
                continue;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }
            if (isPrime) {
                primeNumberCount++;
                primeArray[++primeIndex] = i;
            }
        }
        int[] formattedPrimeArray = new int[primeNumberCount];
        System.arraycopy(primeArray, 0, formattedPrimeArray, 0, primeNumberCount);
        return formattedPrimeArray;
    }

    public static int[] findFibonacciNumbers(Array array) throws NullException {
        int [] arr = array.copy();
        if (arr == null) throw new NullException("Array is null");
        int[] fibonacciArray = new int[arr.length];
        int fibonacciIndex = -1;
        int fibonacciNumberCount = 0;
        for (int i : arr) {
            boolean isFibonacci = i > 0;
            if (i != 1) {
                int a = 1, b = 1;
                int nextFibonacci = 0;
                while (nextFibonacci < i) {
                    nextFibonacci = a + b;
                    a = b;
                    b = nextFibonacci;
                }
                if (i != nextFibonacci) isFibonacci = false;
            }
            if (isFibonacci) {
                fibonacciNumberCount++;
                fibonacciArray[++fibonacciIndex] = i;
            }
        }
        int[] formattedPrimeArray = new int[fibonacciNumberCount];
        System.arraycopy(fibonacciArray, 0, formattedPrimeArray, 0, fibonacciNumberCount);
        return formattedPrimeArray;
    }

    public static int[] findThreeDigitNumberWithDifferentDigit(Array array) throws NullException {
        int [] arr = array.copy();
        if (arr == null) throw new NullException("Array is null");
        int[] threeDigitArray = new int[arr.length];
        int threeDigitIndex = -1;
        int threeDigitCount = 0;
        for (int i : arr) {
            if (i >= 100 && i <= 999) {
                int firstDigit = i / 100;
                int secondDigit = i % 100 / 10;
                int thirdDigit = i % 10;
                if (!(firstDigit == secondDigit || secondDigit == thirdDigit || firstDigit == thirdDigit)) {
                    threeDigitArray[++threeDigitIndex] = i;
                    ++threeDigitCount;
                }
            }
        }
        int[] formattedThreeDigitArray = new int[threeDigitCount];
        System.arraycopy(threeDigitArray, 0, formattedThreeDigitArray, 0, threeDigitCount);
        return formattedThreeDigitArray;
    }
}