class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p=0,t=0;
        int count =0;

        int pl=players.length;
        int tl=trainers.length;

        while(p<pl && t<tl){
             if(players[p]<=trainers[t]){
                count++;
                p++;
             }
             t++;
        }
        return count;
    }
}