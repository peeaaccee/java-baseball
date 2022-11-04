package baseball;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms {

    private static final Random defaultRandom = ThreadLocalRandom.current();

    public static int pickNumberInList(final List<Integer> numbers) {
        validateNumbers(numbers);
        return numbers.get(pickNumberInList(0, numbers.size() - 1));
    }

    public static int pickNumberInRange(final int starInclusive, final int endInclusive) {
        validateRange(starInclusive, endInclusive);
        return starInclusive + defaultRandom.nextInt(endInclusive - starInclusive + 1);
    }
}
