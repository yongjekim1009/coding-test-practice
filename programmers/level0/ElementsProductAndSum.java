// 원소들의 곱과 합

class Solution {
    public int solution(int[] num_list) {
        // 합과 곱을 저장할 변수를 초기화.
        long sumVal = 0; 
        long prodVal = 1; 

        // num_list의 모든 원소를 순회하며 합과 곱을 계산.
        for (int num : num_list) {
            sumVal += num;  // 각 원소를 합
            prodVal *= num; // 각 원소를 곱
        }

        // 모든 원소의 곱과 모든 원소의 합의 제곱을 비교.
        if (prodVal < (sumVal * sumVal)) {
            return 1; // 곱이 합의 제곱보다 작으면 1 반환
        } else {
            return 0; // 그렇지 않으면 0 반환
        }
    }
}