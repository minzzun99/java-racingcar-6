package racingcar.view;


import static racingcar.view.OutputView.*;
import static racingcar.view.message.RaceMessage.*;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    // 입력받는 부분을 담당
    public static String inputCarName() {
        printRaceMessage(CAR_NAME_INPUT);
        return Console.readLine();
    }

    public static String inputNumberOfRace() {
        printRaceMessage(NUMBER_OF_RACE_INPUT);
        return Console.readLine();
    }
}
