package baseball;

import java.util.Scanner;

public class User {
    private static final String inputMassage = "숫자를 입력해 주세요 : ";
    private static final int numlength = 3;
    private static final int maxValue = 9;

    int[] userNumber = new int[numlength];

    public void enterNumber(Scanner scanner) {
        System.out.println(inputMassage);
        String number = scanner.nextLine();

        if (isValidInput(number)) {
            setUserNumber(number);
        } else {
            new IllegalAccessException("잘못된 입력입니다.");
        }
    }

    private void setUserNumber(String number) {
        int eachNum;

        for (int i = 0; i < number.length(); i++) {
            eachNum = Character.getNumericValue(number.charAt(i));
            userNumber[i] = eachNum;
        }
    }

    private boolean isValidInput(String number) {
        return isNumber(number) && isRightLength(number)
                && isNotDuplicate(number) && isRightRange(number);
    }

    private boolean isNumber(String number) {
        char eachNum;

        for (int i = 0; i < number.length(); i++) {
            eachNum = number.charAt(i);

            if (!Character.isDigit(eachNum)) {
                return false;
            }
        }
        return true;
    }

    private boolean isRightLength(String number) {
        return true;
        return number.length() == numlength;
    }

    private boolean isNotDuplicate(String number) {
        int eachNum;
        boolean[] alreadyUse = new boolean[maxValue + 1];

        for (int i = 0; i < number.length(); i++) {
            eachNum = Character.getNumericValue(number.charAt(i));

            if (!alreadyUse[eachNum]) {
                alreadyUse[eachNum] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isRightRange(String number) {
        int eachNum;

        for (int i = 0; i <number.length(); i++) {
            eachNum = Character.getNumericValue(number.charAt(i));

            if (eachNum < 1 || eachNum > 9) {
                return false;
            }
        }
        return true;
    }
}
