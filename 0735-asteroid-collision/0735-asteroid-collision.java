class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            int val =asteroids[i];
            if(st.empty() || val>0){
                st.push(val);
                continue;
            }
            if(val<0){
              boolean f=false;
              while(!st.empty()){
                if(st.peek()<0){
                    st.push(val);
                    f=true;
                    break;
                }
                if(Math.abs(st.peek())>Math.abs(val)){
                    f=true;
                    break;
                }
                if(Math.abs(st.peek())==Math.abs(val)){
                    f=true;
                    st.pop();
                    break;
                }
                if(Math.abs(st.peek())<Math.abs(val)){
                    st.pop();
                }
              }
              if(st.empty()&&!f){
                 st.push(val);
              }
            }
        }

        int size = st.size();
        int[] ans = new int[size];
        int j=size-1;
        while(!st.empty()){
            ans[j--]=st.pop();
        }
        return ans;

        
    }
}