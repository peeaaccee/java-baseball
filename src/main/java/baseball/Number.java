package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;

public class Number {

    private static final int cnt = 3;
    private static final int min = 1;
    private static final int max = 9;
    private static final String inputMassage = "숫자를 입력해 주세요: ";

    private int[] digits;

    public Number() {}

    public int[] getDigits() {
        return this.digits;
    }

    public void setRandomNumber() {
        Set<Integer> digitSet = new HashSet<>();

        while (digitSet != null && digitSet.size() < cnt) {
            digitSet.add(getRandomNumber());
        }

        this.digits = convertIntegerSetToIntArray(digitSet);
    }

    public void inputAnswer() {
        System.out.print(inputMassage);
        String input = Console.readLine();
        setDigits(input);
    }

    private int[] convertIntegerSetToIntArray (Set<Integer> set) {
        return set.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }

    private int getRandomNumber() {
        return Random.pickNumberInRange(min, max)
    }

    private void setDigits(String input) {
        if(!isValidString(input)) {
                throw new IllegalArgumentException();
        }
        this.digits = Arrays.stream(input.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private boolean isValidString(String str) {
        if(!isRightLength(str)) || !isMinToMax(str) || !isNotDuplicate(str)) {
                return false;
        }
        return true;
    }

    private boolean isRightLength(String input) {
        return input.length() == cnt;
    }

    private boolean isMinToMax(String input) {
        Pattern numberPattern = Pattern.compile(regax);
        return numberPattern.matcher(input).matches();
    }

    private boolean isNotDuplicate(String input) {
        Set<Character> set = new HashSet<>();
        for(char s: input.toCharArray()) {
                set.add(s);
        }
        return input.length() == set.size();
    }
}
