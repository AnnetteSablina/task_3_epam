package by.epamtc.task3.utility;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileActions {
    public static int countLines(String fileName) throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader(fileName));
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = reader.readLine()) != null) {}
        cnt = reader.getLineNumber();
        reader.close();
        return cnt;
    }
}
