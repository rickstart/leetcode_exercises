class TwoSumLeetCode {
    // x = target - nums[i]
    public int[] twoSum(int[] nums, int target) {                  
        HashMap<Integer, Integer> mapNum = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i]; 
            if (mapNum.containsKey(x)) {            
                return new int[]{mapNum.get(x), i};
            } else {
                mapNum.put(nums[i], i);    
            }                        
        }
        
        return null;
    }
}