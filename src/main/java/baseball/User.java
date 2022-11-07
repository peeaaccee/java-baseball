package baseball;

import camp.nextstep.edu.missionutils.Console;
import org.assertj.core.util.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class User {
    private static final String INPUT_MASSAGE = "숫자를 입력해주세요 : ";
    private static final int NUMBER_LENGTH = 3;
    private static final int FIRST_NUM = 1;
    private static final int LAST_NUM = 9;

    public List<Integer> getUserNumber() {
        List<Integer> userNumber = new ArrayList<>();

        System.out.println(INPUT_MASSAGE);
        String inputValue = Console.readLine();

        for (int i = 0; i < inputValue.length(); i++) {
            userNumber.add(Integer.parseInt(inputValue.substring(i, i+1)));
        }
        validateUserNumber(userNumber);
        return userNumber;
    }

    public boolean validateUserNumber(List<Integer> num) {
        if (checkLength(num) && checkRange(num) && checkDuplication(num)) {
            return true;
        }
        throw new IllegalArgumentException();
    }

    public boolean checkLength(List<Integer> num) {
        return num.size() == NUMBER_LENGTH;
    }

    public boolean checkRange(List<Integer> num) {
        int check = 0;

        for (int i = 0; i <3; i++) {
            if(FIRST_NUM <= num.get(i) && num.get(i) <= LAST_NUM) {
                check += 1;
            }
        }
        return check == NUMBER_LENGTH;
    }

    public boolean checkDuplication(List<Integer> num) {
        HashSet<Integer> setNum = Sets.newHashSet(num);

        return setNum.size() == num.size();
    }
}