package racingcar.exception.message;

public enum ErrorMessage {
    // 검증에 필요한 메시지
    CAR_NAME_LENGTH_ERROR("자동차의 이름의 길이는 5자 이하만 가능합니다."),
    NOT_CONTAINS_COMMA_ERROR("자동차의 이름은 쉼표(,)를 기준으로 구분합니다."),
    NEGATIVE_NUMBER_ERROR("시도할 횟수를 1이상의 숫자로 입력해주세요."),
    NOT_NUMBER_ERROR("시도할 횟수를 숫자로 입력해주세요.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
