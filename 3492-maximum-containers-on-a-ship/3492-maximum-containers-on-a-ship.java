class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
     int count = 0;

        for(int i = 1;i<=n*n;i++){
            int req = i*w;
            if (req<=maxWeight) count++;
            else{
            break;
            }
        }
        return count;
    }
}