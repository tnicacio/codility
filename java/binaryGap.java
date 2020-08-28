import java.util.ArrayList;

class Solution {
    public int solution(int N) {

        ArrayList<Integer> arr = new ArrayList();
        String x = Integer.toBinaryString(N);
        int y = 0;
        for (int i = 0; i < x.length(); i++){
            
            if (x.charAt(i) == '0'){
                y += 1;
            }
            if (x.charAt(i) == '1'){
                arr.add(y);
                y = 0;
            }
        }
        int z = 0;
        for (int value : arr){
            if (value > z) {
                z = value;
            }
        }
        return z;
    }
}