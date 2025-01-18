class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q= new LinkedList<>();
        int time = 0;
        for(int i=0; i<tickets.length; i++) {
            q.add(i);
        }
        while(!q.isEmpty()) {
            int index = q.poll();
            tickets[index]--;
            time++;
            if(tickets[index]==0 && index==k) {
                return time;
            }
            if(tickets[index] > 0) {
                q.add(index);
            }
        }
          return time;
    }
}