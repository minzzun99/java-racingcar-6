package racingcar.view;

import racingcar.view.message.RaceMessage;

public class OutputView {
    public static void printRaceMessage(RaceMessage msg) {
        System.out.println(msg.getMessage());
    }

    public static void printWinnerMessage(RaceMessage winnerMsg, StringBuilder winner) {
        StringBuilder sb = new StringBuilder(winnerMsg.getMessage()).append(winner);
        System.out.println(sb);
    }
}
