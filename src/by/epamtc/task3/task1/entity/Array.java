package by.epamtc.task3.task1.entity;

import by.epamtc.task3.task1.sort.Sortable;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

public class Array {
    private final int[] array;

    public Array(int[] arr) {
        this.array = new int[arr.length];
        for (int index = 0; index < array.length; index++)
            this.array[index] = arr[index];
    }

    public Array(int size) {
        this.array = new int[size];
    }

    public int getArrayLength() {
        return array.length;
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
        return isEqual;
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
    public void swap(int ind1, int ind2) throws NullException {
        if (array == null) throw new NullException("Array is null");
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public int[] copy(){
        int[] arr = new int [array.length];
        for (int index = 0; index<array.length;index++){
            arr[index] = array[index];
        }
        return arr;
    }
    public int getValue (int index){
        return array[index];
    }



    public void sort(Sortable sort) throws NullException {
        sort.sort(this);
    }
}
