class Solution {
	public int solution(int[] A) {

    long N = A.length + 1;
    long total = (N * (N + 1)) / 2;
    long sum = 0L;

    for (int i : A) {
        sum += i;
    }

    return (int)(total - sum);
	}
}