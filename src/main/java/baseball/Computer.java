package baseball;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;

import java.util.Random;
import java.util.RandomAccess;

public class Computer {
    private static final int numlength = 3;
    private static final int minValue = 1;
    private static final int maxValue = 9;

    int[] answer = new int[numlength];
    boolean[] alreadyUse = new boolean[maxValue + 1];

    public Computer () {
        for (int i = 0; i < numlength; i++) {
            int num = RandomUtils.nextInt(minValue, maxValue);

            if (!alreadyUse[num]) {
                alreadyUse[num] = true;
                answer[i] = num;
            } else {
                i --;
            }
        }
    }

}
