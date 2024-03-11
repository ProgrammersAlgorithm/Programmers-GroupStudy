package round01.thsamajiki;

public class 타겟_넘버 {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public void dfs(int[] numbers, int target, int sum, int depth) {
        if (depth == numbers.length) {
            if (target == sum) answer++;
            return;
        }

        dfs(numbers, target, sum + numbers[depth], depth + 1);
        dfs(numbers, target, sum - numbers[depth], depth + 1);
    }
}
