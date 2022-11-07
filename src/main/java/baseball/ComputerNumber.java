package baseball;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {

    static final int FIRST_NUM = 1;
    static final int LAST_NUM = 9;
    static final int MAX_DIGIT = 3;

    public List<Integer> makeRandomNumber() {
        List<Integer> radomNum = new ArrayList<>();

        for (int i = 0; i < MAX_DIGIT; i++) {
            radomNum.add(Randoms.pickNumberInRange(FIRST_NUM, LAST_NUM));
        }

        return radomNum;
    }
}
