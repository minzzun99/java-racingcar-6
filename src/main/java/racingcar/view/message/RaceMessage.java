package racingcar.view.message;

public enum RaceMessage {
    // 레이스 진행에 필요한 메시지
    CAR_NAME_INPUT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    NUMBER_OF_RACE_INPUT("시도할 회수는 몇회인가요?"),
    RACE_START_MESSAGE("\n실행 결과"),
    WINNER_MESSAGE("최종 우승자 : ");

    private final String msg;
    RaceMessage(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
