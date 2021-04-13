package by.epamtc.task3.utility;


import java.util.Scanner;

public class EnterIntegerValue {
    public static int enterValue(String message, Mode mode) throws NegativeException, ZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while(!scanner.hasNextInt()){
            System.out.println("Try again." + message);
            scanner.next();
        }
        int value = scanner.nextInt();
        if (mode == Mode.POSITIVE && value < 0)  throw new NegativeException("You entered negative value");
        if (mode == Mode.POSITIVE_NOT_NULL && value == 0) throw new ZeroException("Value must be positive and not zero");
        return value;
    }
}