package by.epamtc.task3.utility;

import java.io.IOException;

public class ZeroException extends IOException {

    public ZeroException(String message) {
        super(message);
    }

    public ZeroException() {
        super();
    }

    public ZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroException(Throwable cause) {
        super(cause);
    }
}
