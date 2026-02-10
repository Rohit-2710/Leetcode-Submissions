class Solution {
    public double myPow(double x, int n) {

        long N = n;
        if(N<0){
            x=1/x;
            N=N*-1;
        }
        return calculatePow(x,N);
    }



    public double calculatePow(double x, long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if((n&1)==1){
            return calculatePow(x,n-1)*x;
        }
        return calculatePow(x*x,n/2);
    }

}