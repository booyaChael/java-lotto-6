package lotto;

import java.util.List;

public class Lotto {
    //Lotto에 인스턴스 변수 추가 불가
    //패키지 변경은 가능

    //private 변경 금지
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}
