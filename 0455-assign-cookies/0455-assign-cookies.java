class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int childrenGratified=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1;
        int j=s.length-1;
        while(i>=0 && j>=0){
           if(s[j]>=g[i]){
            childrenGratified++;
            i--;
            j--;
           }else{
               i--;
           }
         
           
        }
        return childrenGratified;
        
    }
}