class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int en=intervals[0][1],cnt=1;
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=en){
                cnt++;
                en=intervals[i][1];
            }
        }
        
        return n-cnt;
    }
}