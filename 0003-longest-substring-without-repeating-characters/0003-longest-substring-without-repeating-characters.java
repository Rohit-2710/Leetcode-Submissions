class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Boolean> hm = new HashMap<>();

        int l=0,r=0;
        int n =s.length();
        int maxLength=0;

        while(r<n){
            char val=s.charAt(r);
            if(hm.containsKey(val)){
                hm.remove(s.charAt(l));
                l++;
            }else{
                int length=r-l+1;
                if(length>maxLength){
                    maxLength=length;
                }
                hm.put(val,true);
                r++;
            }
        }
        return maxLength;
    }
}