class Solution {
    public int largestRectangleArea(int[] heights) {

        int max = 0;
        int n=heights.length;
        int[] pair=new int[2];

        Stack<int[]> st = new Stack<>();

        for(int i=0;i<n;i++){
            int val=heights[i];
            int index=i;
            while(!st.empty() && st.peek()[0]>val){
                 pair=st.pop();
                 int area=pair[0]*(i-pair[1]);
                 if(area>max){
                    max=area;
                 }
                 index=pair[1];
            }
            st.push(new int[] {val,index});
        }

        int finalIndex=n-1;
        while(!st.empty()){
            pair=st.pop();
            int area=pair[0]*(finalIndex-pair[1]+1);
            if(area>max){
                max=area;
            }
        }
         
        return max;

        
    }
}