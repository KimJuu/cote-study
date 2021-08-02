package 모의고사;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1});
        assertThat(s.solution(new int[]{1, 3, 2, 4, 2})).isEqualTo(new int[]{1, 2, 3});
    }
}