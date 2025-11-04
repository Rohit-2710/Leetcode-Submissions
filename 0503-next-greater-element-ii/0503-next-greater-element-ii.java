class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n= nums.length;

        Stack<Integer> st = new Stack<>();
        int[] h = new int[2*n];
        int[] ns = new int[2*n];

        for(int i=0;i<n;i++){
            ns[i]=nums[i];
            ns[n+i]=nums[i];
        }
        
        Arrays.fill(h,-1);

        for(int i=(2*n)-1;i>=0;i--){
            int val=ns[i];
            while(!st.empty() && st.peek()<=val){
                st.pop();
            }
            if(!st.empty()){
                h[i]=st.peek();
            }
            st.push(val);
        }

        return Arrays.copyOfRange(h,0,n);
        
    }
}