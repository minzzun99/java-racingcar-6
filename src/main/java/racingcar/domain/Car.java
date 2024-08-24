package racingcar.domain;

public class Car {
    // 자동차의 이름, 현재 위치
    private final String carName;
    private int location;

    public Car(String carName) {
        this.carName = carName;
        this.location = 0;
    }

    public void moveLocation(boolean move) {
        if (move) {
            this.location++;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getLocation() {
        return location;
    }
}
