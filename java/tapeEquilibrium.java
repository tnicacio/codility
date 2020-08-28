class Solution {
    public int solution(int[] A) {
        
   int n = A.length;

    int sum1 = A[0];
    int sum2 = 0;

    int p = 1;
    
    for (int i = p; i < n; i++) {
        sum2 += A[i];
    }
    int diff = Math.abs(sum1 - sum2);

    for (; p < n-1; p++) {
        sum1 += A[p];
        sum2 -= A[p];

        int newDiff = Math.abs(sum1 - sum2);
        if (newDiff < diff) {
            diff = newDiff;
        }
    }
    return diff;
    }
}