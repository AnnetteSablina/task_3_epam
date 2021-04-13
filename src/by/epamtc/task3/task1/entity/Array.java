package by.epamtc.task3.task1.entity;


import by.epamtc.task3.task1.sortAction.Sort;
import by.epamtc.task3.task1.sortAction.SortActions;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

import java.util.Arrays;

public class Array implements Sort {
    private final int[] array;

    public Array(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public Array(int size) {
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        if (this.array.length != array1.array.length) return false;
        boolean isEqual = true;
        for (int index = 0; index < this.array.length; index++)
            if (this.array[index] != array1.array[index]) {
                isEqual = false;
                break;
            }
        return  isEqual;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(getClass().getName() + "{ " +
                "has values = [");
        for (int i : this.array) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.append("] }");
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int value : this.array) {
            result += value * 31;
        }
        return result;
    }

    @Override
    public Array bubbleSort() throws ZeroException, NullException {
        if (array.length == 0) throw new ZeroException("Array has 0 length");
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int index = 1; index < array.length; index++) {
                if (array[index] < array[index - 1]) {
                    SortActions.swap(array, index, index - 1);
                    needIteration = true;
                }
            }
        }
        return this;
    }

    @Override
    public Array selectionSort() throws ZeroException, NullException {
        if (array.length == 0) throw new ZeroException("Array has 0 length");
        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            SortActions.swap(array, left, minIndex);
        }
        return this;
    }

    @Override
    public Array shuttleSort() throws ZeroException, NullException {
        if (array.length == 0) throw new ZeroException("Array has 0 length");
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[index - 1]) {
                SortActions.swap(array, index, index - 1);
                for (int z = index - 1; z >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        SortActions.swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return this;
    }
}
