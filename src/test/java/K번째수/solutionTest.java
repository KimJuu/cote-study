package K번째수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class solutionTest {

    @Test
    void test() {
        solution s = new solution();

        assertThat(s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})).isEqualTo(new int[]{5, 6, 3});
    }
}
