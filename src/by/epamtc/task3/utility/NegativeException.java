package by.epamtc.task3.utility;

import java.io.IOException;

public class NegativeException extends IOException {

    public NegativeException(String message) {
        super(message);
    }

    public NegativeException() {
        super();
    }

    public NegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeException(Throwable cause) {
        super(cause);
    }
}
