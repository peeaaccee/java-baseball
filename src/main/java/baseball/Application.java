package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        final Scanner scanner = new Scanner(System.in);

        Game game = new Game(scanner);
        game.start();
    }
}
