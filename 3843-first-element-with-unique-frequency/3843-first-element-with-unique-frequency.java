class Solution {
    public int firstUniqueFreq(int[] nums) {
      int n =  nums.length;
        int [] freq = new int [1000001];  //first count frequency of each numbers which comming at every indices
          for (int i = 0 ;i<n ; i++){
            freq[nums[i]] ++;
        }

        int [] Countfreq = new int [n+1];  //now count  number of times of frequency of number
          for (int i = 0;i<freq.length;i++){
            if (freq[i]> 0) Countfreq[freq[i]]++;
        }

        for (int i = 0 ;i< n ;i++){    //now check first uniques number by seeing no of no of frequency
            if( Countfreq[freq[nums[i]]] ==1) return nums[i];
        }
    
        return -1;
    }
}