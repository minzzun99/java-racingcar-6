package racingcar.controller;

import static racingcar.service.CarMove.moveCar;
import static racingcar.service.RaceResult.*;
import static racingcar.view.InputView.*;
import static racingcar.view.OutputView.*;
import static racingcar.view.message.RaceMessage.*;

import java.util.List;
import racingcar.domain.Car;
import racingcar.exception.InputValidator;
import racingcar.service.CarNameTokenizer;


public class RaceController {
    private static List<Car> cars;          // 자동차를 저장
    private static List<String> winnerList;

    public void setRace() {
        try {
            // 자동차의 이름을 입력받는 부분
            String namesInput = inputCarName();
            InputValidator inputValidator = new InputValidator();
            inputValidator.carNameInputLineValid(namesInput);

            // 자동차의 이름을 리스트로 반환
            CarNameTokenizer carNameTokenizer = new CarNameTokenizer();
            cars = carNameTokenizer.setCarList(namesInput);

            // 레이스의 시도 횟수를 입력받는 부분
            String numberInput = inputNumberOfRace();
            inputValidator.inputNumberOfRaceValid(numberInput);
            int numberOfRace = Integer.parseInt(numberInput);

            startRace(numberOfRace);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void startRace(int numberOfRace) {
        printRaceMessage(RACE_START_MESSAGE);
        while (numberOfRace-- > 0) {
            // 랜덤넘버를 생성하고, 각 레이스의 실행 결과를 출력하고, winnerList에 우승자 저장
            moveCar(cars);
            printRoundResult(roundResult(cars));
        }

        printRaceWinner();
    }

    public void printRaceWinner() {
        // 레이스 우승자를 반환하는 메서드를 호출
        winnerList = setWinnerList(cars);

        // 레이스의 최종 우승자를 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < winnerList.size() - 1; i++) {
            sb.append(winnerList.get(i)).append(", ");
        }
        sb.append(winnerList.get(winnerList.size() - 1));
        printWinnerMessage(WINNER_MESSAGE, sb.toString());
    }
}
