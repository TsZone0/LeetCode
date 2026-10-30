class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int counter  = 0;
        int val = tickets[k];

        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }
        while(!q.isEmpty()){

                int temp = q.remove();
                tickets[temp]--;
                counter++;

             if (temp == k && tickets[k] == 0) {
                return counter;
            }
            
 
            if (tickets[temp] > 0) {
                q.add(temp);
            }


        }
        return counter;
    }
}