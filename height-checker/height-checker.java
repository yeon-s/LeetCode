import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        
        int answer=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                answer++;
            }
        }
        return answer;
    }
}