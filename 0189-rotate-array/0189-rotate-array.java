class Solution {
    public void rotate(int[] nums, int k) {
        Map<Integer,Integer> valueIndexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            valueIndexMap.put(i,nums[i]);
        }
        for(Map.Entry<Integer, Integer> entry : valueIndexMap.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            int newIndex=(key+k)%nums.length;
            nums[newIndex]=value;
        }
        
    }
}