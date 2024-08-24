package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;

public class RaceResult {
    // 시도 횟수 별 레이스의 결과를 String 타입으로 return
    public static String roundResult(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getCarName())
                    .append(" : ")
                    .append(nowLocation(car.getLocation()))
                    .append('\n');
        }
        return sb.toString();
    }

    public static List<String> setWinnerList(List<Car> cars) {
        int maxLocation = 0;
        for (Car car : cars) {
            maxLocation = Math.max(maxLocation, car.getLocation());
        }

        // 각 자동차의 위치가 maxLocation과 동일하면 List에 추가
        List<String> winnerList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getLocation() == maxLocation) {
                winnerList.add(car.getCarName());
            }
        }

        return winnerList;
    }

    public static String nowLocation(int location) {
        StringBuilder sb = new StringBuilder();
        while (location-- > 0) {
            sb.append('-');
        }
        return sb.toString();
    }
}
