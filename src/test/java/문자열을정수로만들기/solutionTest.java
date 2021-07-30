package 문자열을정수로만들기;

import org.junit.jupiter.api.Test;
import 문자열을정수로바꾸기.solution;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution("1234")).isEqualTo(1234);
        assertThat(s.solution("-1234")).isEqualTo(-1234);
    }
}