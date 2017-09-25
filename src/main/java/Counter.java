package main.java;

/**
 * Created by Юра on 25.09.2017.
 */
public class Counter {
    private static int count;
    public static int getCount() {
        return ++count;
    }
}
