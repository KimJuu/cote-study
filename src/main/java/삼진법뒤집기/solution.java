package 삼진법뒤집기;

public class solution {

    public int solution(int n) {
        int answer = 0;
        String converted = "";
        String reverseStr = "";

        while(n > 0){
            converted = n%3 + converted;
            n /= 3;
        }

        StringBuilder sb = new StringBuilder(converted);
        reverseStr = sb.reverse().toString();
        answer = Integer.parseInt(reverseStr, 3);

        return answer;
    }

}
