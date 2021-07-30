package 삼진법뒤집기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution(45)).isEqualTo(7);
        assertThat(s.solution(125)).isEqualTo(229);
    }
}