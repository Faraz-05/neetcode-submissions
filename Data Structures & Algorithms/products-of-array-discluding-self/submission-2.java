// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] res = new int[nums.length]; 
//         for(int i=0;i<nums.length;i++){
//             int product=1;
//             for(int j=0;j<nums.length;j++){
//                 if(j!=i){
//                     product*=nums[j];
//                 }
//             }
//             res[i]=product;
//         }
//         return res;
//     }
// }  





class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        // Left products
        int prefix = 1;

        for(int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        // Right products
        int suffix = 1;

        for(int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
