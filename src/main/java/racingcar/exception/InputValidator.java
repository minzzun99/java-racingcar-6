package racingcar.exception;

import static racingcar.exception.message.ErrorMessage.*;

public class InputValidator {
    public void carNameInputLineValid(String line) {
        // 자동차 이름을 입력받는 줄에 쉼표가 있는지 검증
        if (!line.contains(",")) {
            throw new IllegalArgumentException(String.valueOf(NOT_CONTAINS_COMMA_ERROR));
        }
    }

    public void carNameInputValid(String name) {
        // 자동차 이름이 5자 이하인지 확인
        if (name.length() > 5) {
            throw new IllegalArgumentException(String.valueOf(CAR_NAME_LENGTH_ERROR));
        }
    }

    public void inputNumberOfRaceValid(String str) {
        // 입력받은 문자열이 숫자가 맞는지
        boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?");
        if (!isNumeric) {
            throw new IllegalArgumentException(String.valueOf(NOT_NUMBER_ERROR));
        }

        // 입력받은 숫자가 1 이상인지 확인
        if (Integer.parseInt(str) <= 0) {
            throw new IllegalArgumentException(String.valueOf(NEGATIVE_NUMBER_ERROR));
        }
    }
}
