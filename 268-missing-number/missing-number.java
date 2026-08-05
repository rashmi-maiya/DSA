class Solution {
    public int missingNumber(int[] nums) {
        int xorSum = 0;

        // xor with nums array
        for(int n:nums){
            xorSum = xorSum ^ n;
        }

        //xor with range array
        int n = nums.length;
        for(int i=0;i<=n;i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }
}