package 삼진법;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution("1234")).isEqualTo(1234);
        assertThat(s.solution("-1234")).isEqualTo(-1234);
    }
}