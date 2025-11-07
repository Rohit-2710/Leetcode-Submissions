class Solution {
    public int longestOnes(int[] nums, int k) {

        int l=0,r=0;

        int max=0;

        while(r<nums.length){
            if(nums[r]==1){
                int length=r-l+1;
                max=Math.max(length,max);
                r++;
            }else{
                if(k>0){
                    k--;
                    int length=r-l+1;
                    max=Math.max(length,max);
                    r++;
                }else{
                    while((l<=r)&&(nums[l]==1)){
                       l++;
                    }
                    if((l<=r)&&(nums[l]==0)){
                        k++;
                        l++;
                    }
                }
            }
        }

        return max;
        
    }
}