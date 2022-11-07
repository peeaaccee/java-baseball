package baseball;

import java.util.List;

public class Game {
    static final String START_MESSAGE = "숫자 야구 게임을 시작합니다";
    static final String NOTHING = "낫싱";
    static final String SOME_CORRECT = "%d볼 %d스트라이크\n";
    static final String ALL_CORRECT = "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private ComputerNumber computer = new ComputerNumber();
    private List<Integer> computerNumber;

    public void startGame() {
        System.out.println(START_MESSAGE);
        computerNumber = computer.makeRandomNumber();
        playGame();
    }

}
