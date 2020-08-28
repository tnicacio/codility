class Solution {
    public int solution(int X, int Y, int D) {
        int a = Y - X;
        int b = D;
        int jumps = 0;
        if (b != 0){
            jumps = (a + b - 1)/b;
        }
        return jumps; 
    }
}