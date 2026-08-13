class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for(int i = 0; i<piles.length; i++){
            max = Math.max(piles[i],max);
        }

        int l = 1;
        int r = max;

        while(l<=r){
            int mid = (l+r)/2;

            if(function(piles,mid)<=h){
                r= mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    private int function(int[] piles,int hourlybanana){

        int totalhrs = 0;

        for(int i = 0; i<piles.length; i++){
            totalhrs+=Math.ceil((double)piles[i]/(double)hourlybanana);
        }

        return totalhrs;

    }
}
