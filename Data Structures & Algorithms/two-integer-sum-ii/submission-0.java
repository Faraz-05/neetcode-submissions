class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],j);
        }
        for(int j=0;j<nums.length;j++){
            int a=target-nums[j];
            if(map.containsKey(a) && map.get(a) != j){
                return new int[]{j+1,map.get(a)+1};
            }
        }
        return new int[0];
    }
}
