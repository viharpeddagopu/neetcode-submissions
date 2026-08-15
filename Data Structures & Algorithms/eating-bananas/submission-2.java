//the possible answer could be in between 1ban/hr and max pile bn/hr
//this is the range of the answer
//so we apply bin search on answer to guess the correct answer

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; //min 1 banana
        int r = 1;

        for(int pile : piles){
            r = Math.max(r, pile);
        }
        int result = r;

        while(l <= r){
            int k = l + (r-l)/2; //perform BS on this mid

            if(canFinish(piles, h, k)){
                result = k;
                r = k - 1;
            }
            else
                l = k + 1;
        }
        return result;
    }

    public boolean canFinish(int[] piles, int h, int k){
        long hours_needed = 0;

        for(int pile : piles){
            hours_needed += (pile + k - 1)/k;
            //do this instead of using math.ceil (for faster calc)
            //the k - 1 is the max reminder that is similar to ceil
            //10 bananas, rate = 3/hr
            //10/3 = 3.33, ceil --> 4 (takes 4 hrs to finish the pile)
        }
        return hours_needed <= h;
    }
}
