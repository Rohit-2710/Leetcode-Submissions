class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n1=nums1.length;
        int n2=nums2.length;

        int[] ans = new int[n1];

        Arrays.fill(ans,-1);

        for(int i=n1-1;i>=0;i--){
            int val = nums1[i];
            int j = n2-1;

            Stack<Integer> st = new Stack<>();

            while(val!=nums2[j]){
                if(st.empty()){
                    st.push(nums2[j]);
                    j--;
                    continue;
                }
                while(!st.empty()&&st.peek()<=nums2[j]){
                    st.pop();
                }
                st.push(nums2[j]);
                j--;
            }
            while(!st.empty()&&st.peek()<=val){
                    st.pop();
            }
            if(!st.empty()&&st.peek()>val){
                ans[i]=st.peek();
            }


        }

        return ans;

        
        
    }
}