package 음양더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class solutionTest {

    @Test
    public void Test(){
        solution s = new solution();


        assertThat(s.solution(new int[]{4,7,12}, new boolean[]{true, false, true})).isEqualTo(9);
        assertThat(s.solution(new int[]{1,2,3}, new boolean[]{false, false, true})).isEqualTo(0);


    }

}
