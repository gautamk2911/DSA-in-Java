class Solution {

    public int findMax(int[] arr){
        int max = 0;
        for(int i : arr){
            max = Math.max(i, max);
        }
        return max;
    }

    public int calculateHours(int[] piles, int k){
        int totalHours = 0;

        for(int i : piles){
            totalHours += Math.ceil((double)i / k);
        }

        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int result = high;

        while(low <= high){
            int mid = (low + high) / 2;
            int totalHours = calculateHours(piles, mid);

            if(totalHours <= h){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
