

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        for(int i=0;i<size;i++){
            int x = nums[i];
            if(i>0 && nums[i-1]==x){
                continue;
            }
            
            int left = i+1;
            int right = size-1;
            
            while(left<right){
                int sum = nums[left]+nums[right];
                
                if(sum+x==0){
                    List<Integer> list = new ArrayList<>();
                    
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(x);
                    answer.add(list);
                }
                
                if(sum+x>0){
                    right--;
                    while(nums[right]==nums[right+1] && left<right){
                        right--;
                    }
                }else{
                    left++;
                    while(nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                }
            }
        }
        
        return answer;
    }
}