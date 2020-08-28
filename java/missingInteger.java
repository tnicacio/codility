import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

    int [] positiveDistinct = Arrays.stream(A).distinct().filter(num -> num > 0).sorted().toArray();
        
    if (positiveDistinct.length == 0 || positiveDistinct[0] != 1){
        return 1;
    }
        
    if (positiveDistinct.length == 1){
        return positiveDistinct[0] == 1 ? 2 : 1;
    }
        
    for (int i = 1; i < positiveDistinct.length; i++){
        if(positiveDistinct[i] != i+1){
            return positiveDistinct[i-1] + 1;
        }
    }
    return positiveDistinct.length + 1;
    }
}