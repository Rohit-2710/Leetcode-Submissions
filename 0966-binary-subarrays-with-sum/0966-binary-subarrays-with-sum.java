class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

       Map<Integer,Integer> hm = new HashMap<>();
       hm.put(0,1);

       int sum=0;
       int count=0;

       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int val = sum-goal;

           if(hm.containsKey(val)){
            count+=hm.get(val);
           }

           if(hm.containsKey(sum)){
            hm.put(sum,hm.get(sum)+1);
           }else{
            hm.put(sum,1);
           }
       }
       return count;
    }
}