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
    public static void LastCharIsComma(String name) {
        if(! name.endsWith(",")) {
            throw new IllegalArgumentException("잘못된 입력 : \",\" 뒤는 자동차 이름이 들어가야합니다.");
        }
    }

    public static void CarNameLength(List<String> list) {
        for(String name: list) {
            if(name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하여야 합니다.");
            }
        }
    }

    public static void CarNameIsOne(List<String> list) {
        if(list.size() == 1) {
            throw new IllegalArgumentException("자동차 이름은 2개 이상 입력해야 합니다.");
        }
    }
}
