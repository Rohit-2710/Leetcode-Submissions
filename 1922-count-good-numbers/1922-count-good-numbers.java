// class Solution {

//     public static int MOD=1_000_000_007;

//     public int countGoodNumbers(long n) {
//         long evenIndexes = 0;
//         long oddIndexes =0;

//         if((n&1)==1){
//             evenIndexes=(int)(n/2)+1;
//             oddIndexes=(int)(n/2);
//         }else{
//             evenIndexes=(int)n/2;
//             oddIndexes=evenIndexes;
//         }

//         long evenValue=calculatePower(5,evenIndexes);
//         long oddValue=calculatePower(4,oddIndexes);

//         return (int)((evenValue*oddValue)%MOD);


        
//     }

//     public long calculatePower(long x, long n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return x%MOD;
//         }
//         if((n&1)==1){
//             return (calculatePower(x,n-1)*x)%MOD;
//         }
//         return (calculatePower(x*x,n/2)%MOD);
//     }
    
// }

class Solution {

    public static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {

        long evenIndexes;
        long oddIndexes;

        if ((n & 1) == 1) {
            evenIndexes = n / 2 + 1;
            oddIndexes  = n / 2;
        } else {
            evenIndexes = n / 2;
            oddIndexes  = n / 2;
        }

        long evenValue = calculatePower(5, evenIndexes);
        long oddValue  = calculatePower(4, oddIndexes);

        // 🔴 FIX #3: multiplication must be done in long
        return (int)((evenValue * oddValue) % MOD);
    }

    // 🔴 FIX #1: x must be long (not int)
    public long calculatePower(long x, long n) {

        if (n == 0) return 1;
        if (n == 1) return x % MOD;

        if ((n & 1) == 1) {
            // 🔴 FIX #2: apply modulo immediately after multiplication
            return (calculatePower(x, n - 1) * x) % MOD;
        }

        long half = calculatePower(x, n / 2);
        // 🔴 FIX #2 again
        return (half * half) % MOD;
    }
}
