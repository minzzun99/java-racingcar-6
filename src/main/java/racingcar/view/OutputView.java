package racingcar.view;

import racingcar.view.message.RaceMessage;

public class OutputView {
    // 레이스 진행에 필요한 메시지를 출력하는 메서드
    public static void printRaceMessage(RaceMessage msg) {
        System.out.println(msg.getMessage());
    }

    // 레이스의 결과를 출력하는 메서드
    public static void printRoundResult(String roundResult) {
        System.out.println(roundResult);
    }

    // 최종 우승자를 출력하는 메서드
    public static void printWinnerMessage(RaceMessage winnerMsg, String winner) {
        StringBuilder sb = new StringBuilder(winnerMsg.getMessage()).append(winner);
        System.out.println(sb);
    }
}
