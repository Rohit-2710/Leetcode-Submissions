class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p=0,t=0;
        int count =0;

        while(p<players.length && t<trainers.length){
           while(t<trainers.length&&players[p]>trainers[t]){
            t++;
           }
           if(t<trainers.length && players[p]<=trainers[t]){
             count+=1;
             p++;
             t++;
           }

        }
        return count;
    }
}