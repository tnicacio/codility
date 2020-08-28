class Solution {
    public int solution(int[] A) {
        int result = 0;
        
        for (int res : A){
            result ^= res;
        }
        return result;
    }
}