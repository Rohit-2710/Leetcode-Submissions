class StockSpanner {

    List<Integer> arr = new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        arr.add(price);
        int n=arr.size();
        int counter=0;
        while(n-1>=0){
           int val =arr.get(n-1);
           if(val>price){
            break;
           }
           counter++;
           n--;
        }
        return counter;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */