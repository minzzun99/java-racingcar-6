package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import racingcar.domain.Car;
import racingcar.exception.InputValidator;

public class CarNameTokenizer {
    public List<Car> setCarList(String input) {
        // 자동차의 이름을 쉼표로 나누고 리스트에 저장해서 return하는 메서드
        List<Car> carList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input, ",");

        while (st.hasMoreTokens()) {
            try {
                String carName = st.nextToken();

                // 자동차 이름 검증
                InputValidator inputValidator = new InputValidator();
                inputValidator.carNameInputValid(carName);

                carList.add(new Car(carName));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        return carList;
    }
}
