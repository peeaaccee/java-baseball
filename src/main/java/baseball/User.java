package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static final String INPUT_MASSAGE = "숫자를 입력해주세요 : ";

    public List<Integer> getUserNumber() {
        List<Integer> userNumber = new ArrayList<>();

        System.out.println(INPUT_MASSAGE);
        String inputValue = Console.readLine();

        for (int i = 0; i < inputValue.length(); i++) {
            userNumber.add(Integer.parseInt(inputValue.substring(i, i+1)));
        }
        return userNumber;
    }
}