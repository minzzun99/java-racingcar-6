package racingcar.domain;

public class Car {
    // 자동차의 이름, 랜덤 숫자
    private final String carName;
    private int randomNumber;
    private int location;

    public Car(String carName) {
        this.carName = carName;
        this.randomNumber = 0;
        this.location = 0;
    }
}
