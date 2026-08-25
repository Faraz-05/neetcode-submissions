class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int count=0;
        for(int i=0;i<piles.length;i++){
            count=Math.max(count,piles[i]); 
        }
        int l=1,r=count;
        
        while(l<=r){
            int mid=(l+r)/2;

            long totalTime=0;
            for(int p:piles){
                totalTime+=Math.ceil((double)p/mid);
            }

            if(totalTime<=h){
                count=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return count;
    }
}
