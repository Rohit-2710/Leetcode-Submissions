class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        int l = str.length();

        for(int i=0;i<l;i++){
            char c =str.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                s.push(c);
            }
            else if(s.empty()){
                return false;
            }else if((c=='}')&&(s.peek()!='{')){
                return false;
            }else if((c==')')&&(s.peek()!='(')){
                return false;
            }else if((c==']')&&(s.peek()!='[')){
                return false;
            }else{
                s.pop();
            }
        }

        if(s.empty()){
            return true;
        }
        return false;
        
    }
}