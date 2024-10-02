import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {

        // 배열 길이가 1일 때는 바로 {-1}을 반환
        if (array.length == 1) {
            int[] result = {-1};
            return result;
        }

        // 최소값 찾기
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(array[i], min);
        }

        // 최소값이 제외된 새로운 배열 만들기
        int[] result = new int[array.length-1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                continue;
            }
            result[index++] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution(); // Solution 클래스 인스턴스 생성

        // 테스트할 배열 정의
//        int[] array = {1};
        int[] array = {2,10,8,-100,4};

        // solution 메서드 호출
        int[] result = sol.solution(array);

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }
}
