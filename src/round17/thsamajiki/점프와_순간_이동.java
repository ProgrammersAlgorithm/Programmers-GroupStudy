import java.util.*;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                answer++;
            }
        }

        return answer;
    }
}
