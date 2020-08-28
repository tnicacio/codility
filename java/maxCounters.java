class Solution {
    
    private static int maxCount = 0;
    private static int minCount = 0;
    
    public int[] solution(int N, int[] A) {
                int [] counter = new int [N];
        
        for (int ak : A){
            if (ak > 0 && ak < (N+1)){
                increase(ak,counter);
            }
            else if (ak == (N+1)){
                minCount = maxCount;
            }
        }
        
        for (int i = 0; i < counter.length; i++){
            if (counter[i] < minCount){
            counter[i] = minCount;
            }
        }
        
        return counter;
    }
    
    public void increase(int X, int [] C){
        if (C[X-1] < minCount){
            C[X-1] = minCount;
        }
        C[X-1] += 1;
        if (C[X-1] > maxCount){
            maxCount = C[X-1];
        }
    }    
    
}