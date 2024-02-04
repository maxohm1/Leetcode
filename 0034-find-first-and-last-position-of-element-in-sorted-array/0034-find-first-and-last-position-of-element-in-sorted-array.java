class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int ans[]= new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0; i<nums.length; i++){
           if(nums[i]==target && (i==0||nums[i-1]!=target))
           {
               ans[0]=i;
               
            }
            if(nums[i]==target&&(i==nums.length-1 ||nums[i+1]!=target))
            {
                ans[1]=i;
            }
            }
            // else{
            //     return -1
            // }
        
        return ans;
    }
}