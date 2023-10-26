package racingcar.util;

import java.util.List;


public class Validate {
    public static void CarNameNumeric(List<String> list) {
        for(String name: list) {
            if (name.chars().anyMatch(Character::isDigit)) {
                throw new IllegalArgumentException("자동차 이름에 숫자는 넣을 수 없습니다.");
            }
        }
    }
}
