class Solution {
    public int majorityElement(int[] a) {
       int  count=0;
       int  candidate =0;
        for(int num :a){
if( count==0){
candidate =num;
}
if(num==candidate)
count++;
else count--;

} return candidate;

}}


