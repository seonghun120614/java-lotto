package lotto.console;

import camp.nextstep.edu.missionutils.Console;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Input {

    public static int inputCostNumber() throws IOException {
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> inputWinningNumbers() {
        String[] s = Console.readLine().split(",");

        List<Integer> answer = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        if(answer.size() != 6) {
            throw new IllegalArgumentException("[Error] 당첨 번호를 잘못입력했습니다.");
        }

        return answer;
    }

    public static int inputBonusNumber() {
        return Integer.parseInt(Console.readLine());
    }
}
