class Solution {
    public int[] twoSum(int[] nums, int target) {

   
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[] {i, j};  // Perfect!
                }
            }
        }
        // You should add a return here (see note below)
        return new int[]{}; // or throw exception
    }
}
