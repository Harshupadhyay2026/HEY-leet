class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[128];
        int n = s.length();

      for(int i =0;i<n;i++){
        freq [s.charAt(i)]++;
      }

      while(sb.length()<n){
      //finding max count in freq array
     int  max = 0;
      for(int i =1;i<128;i++){
        if(freq[i]>freq[max])
        max = i;
      }
      //appending the maxinmum occuring aschii value
    //  int characterAt_max_= aschii_value freq max = freq[max];

      for (int i =0;i<freq[max];i++){
         sb.append((char)max) ;  //converting ascii value into character
      }
      //removing prev max candidate
      freq[max]=0;
      }
      return sb.toString();

      }
}