class Solution {
    public int digitFrequencyScore(int n) {
        
        int[]freq = new int [10];

        String s = String.valueOf(n);

        for (char c :s.toCharArray() ){
            freq[c-'0']++;
        }
        int score = 0;
        for (int digit =0;digit<10;digit++){

            score = score + digit*freq[digit];
        }
        return score;

    }
}