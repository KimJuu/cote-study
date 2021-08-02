package 부족한금액계산하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution(3, 20, 4)).isEqualTo(10);
    }
}