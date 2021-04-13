package by.epamtc.task3.task1.sortAction;

import by.epamtc.task3.task1.entity.Array;
import by.epamtc.task3.utility.NullException;
import by.epamtc.task3.utility.ZeroException;

public interface Sort {
    Array bubbleSort () throws ZeroException, NullException;
    Array selectionSort () throws ZeroException, NullException;
    Array shuttleSort() throws ZeroException, NullException;
}

