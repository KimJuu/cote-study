package 두개뽑아서더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {
    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution(new int[]{2, 1, 3, 4, 1})).isEqualTo(new int[]{2,3,4,5,6,7});
        assertThat(s.solution(new int[]{5, 0, 2, 7})).isEqualTo(new int[]{2,5,7,9,12});
    }
}