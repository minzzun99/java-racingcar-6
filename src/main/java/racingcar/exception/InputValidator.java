package racingcar.exception;

import static racingcar.exception.message.ErrorMessage.*;

public class InputValidator {
    // 자동차 이름을 검증하는 기능 구현

    // 자동차 이름을 입력받는 줄에 쉼표가 있는지 검증
    public static void carNameInputLineValid(String line) {
        if (!line.contains(",")) {
            throw new IllegalArgumentException(String.valueOf(NOT_CONTAINS_COMMA_ERROR));
        }
    }

    // 자동차 이름이 유효한지 검증
    public static void carNameInputValid(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(String.valueOf(CAR_NAME_LENGTH_ERROR));
        }
    }

    public static void inputNumberOfRaceValid(String str) {
        boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
        if (!isNumeric) {
            throw new IllegalArgumentException(String.valueOf(NOT_NUMBER_ERROR));
        }

        if (Integer.parseInt(str) <= 0) {
            throw new IllegalArgumentException(String.valueOf(NEGATIVE_NUMBER_ERROR));
        }
    }
}
