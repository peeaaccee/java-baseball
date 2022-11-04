package baseball;

public class GameSystem {
    private static final String ballStrike = "볼";
    private static final String strikeStr = "스트라이크";
    private static final String nothing = "낫싱";

    private int[] player;
    private int[] computer;

    private int strike;
    private int ball;

    public GameSystem() {}

    public GameSystem(int[] player, int[] computer) {
            this.player = player;
            this.computer = computer;
    }

    public void printResult() {
        System.out.println(getResultString());
    }

    private String getResultString() {
        if(strike == 0 && ball == 0) {
            return nothing;
        }

        StringBuilder sb = new StringBuilder();
        if(ball > 0) {
                sb.append(ball).append(ballStrike);
        }
        if(strike > 0) {
                sb.append(strike).append(strikeStr);
        }
        return sb.toString();

    }

}
