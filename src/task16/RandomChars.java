package task16;

import java.nio.CharBuffer;
import java.util.Random;

public class RandomChars implements Readable {
    private Random random = new Random();
    private char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private int сount;
    private int amountOfChars;

    public RandomChars(int count) {
        if (count < 0) {
            System.out.println("Not a valid value");
            return;
        }


        this.сount = count;
        this.amountOfChars = count;
    }

    public int read(CharBuffer charBuffer) {
        if (сount-- == 0) {
            return -1;
        }
        charBuffer.append(chars[random.nextInt(chars.length)]);
        return amountOfChars;
    }
}
