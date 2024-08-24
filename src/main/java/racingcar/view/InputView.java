package racingcar.view;

import static racingcar.view.OutputView.*;
import static racingcar.view.message.RaceMessage.*;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    // 자동차의 이름을 입력받는 메서드
    public static String inputCarName() {
        printRaceMessage(CAR_NAME_INPUT);
        return Console.readLine().replaceAll("\\s", "");        // 공백제거
    }

    // 레이스의 시도 횟수를 입력받는 메서드
    public static String inputNumberOfRace() {
        printRaceMessage(NUMBER_OF_RACE_INPUT);
        return Console.readLine();
    }
}
