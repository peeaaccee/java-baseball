package baseball;

import java.util.List;

public class Game {
    static final String START_MESSAGE = "숫자 야구 게임을 시작합니다";
    static final String NOTHING = "낫싱";
    static final String SOME_CORRECT = "%d볼 %d스트라이크\n";
    static final String ALL_CORRECT = "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private ComputerNumber computer = new ComputerNumber();
    private User user = new User();
    private List<Integer> computerNumber;
    private List<Integer> userNumber;
    private int strike = 0;
    private int ball = 0;


    public void startGame() {
        System.out.println(START_MESSAGE);
        computerNumber = computer.makeRandomNumber();
        playGame();
    }
    private void playGame() {
        do {
            resetCount();
            userNumber = user.getUserNumber();
            for (int i = 0; i < 3; i++) {
                calculateCount(computerNumber, userNumber.get(i), i);
            }
            printMessage(strike, ball);
        } while (this.strike != 3);
    }
    private void calculateCount(List<Integer> computerNum, int userNumber, int idx) {
        for (int i = 0; i < 3; i++) {
            if (computerNum.get(i) == userNumber && i == idx) {
                strike++;
            } else if (computerNum.get(i) == userNumber) {
                ball++;
            }
        }
    }
    private void printMessage(int strike, int ball) {
        if (strike == 3) {
            System.out.println(ALL_CORRECT);
        } else if (strike == 0 && ball == 0) {
            System.out.println(NOTHING);
        } else {
            System.out.printf(SOME_CORRECT, ball, strike);
        }
    }
    private void resetCount() {
        this.strike = 0;
        this.ball = 0;
    }
}
