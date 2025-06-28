// 카운트 업

class Solution {
    public int[] solution(int start_num, int end_num) {
        int total = end_num - start_num + 1;
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = start_num + i;
        }

        return arr;
    }
}