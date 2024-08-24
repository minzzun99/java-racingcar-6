package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.domain.Car;

public class CarMove {
    private static int START_RANGE = 0;
    private static int END_RANGE = 9;
    private static int MOVE_THRESHOLD = 4;

    public static void moveCar(List<Car> cars) {
        // 각 자동차를 이동하는 메서드
        for (int i = 0; i < cars.size(); i++) {
            int randomNumber = generateRandomNumber();
            if (randomNumber >= MOVE_THRESHOLD) {
                cars.get(i).moveLocation(true);
            }
        }

    }

    public static int generateRandomNumber() {
        return Randoms.pickNumberInRange(START_RANGE, END_RANGE);
    }
}
