class Solution {
    public int[] solution(int[] A, int K) {
        int tam = A.length;
        int [] B = new int[tam];
        int rot = 0;
        
        if (tam != 0){
            rot = K%tam;
        }
        
        if (K == 0 || rot == 0 || rot == tam){
            return A;
        }
        for (int i = 0; i < rot; i++){
            B[i] = A[tam - rot + i];
        }
        for (int i = rot; i < tam; i++){
            B[i] = A[i - rot];
        }
        return B;
        
    }
}