class Solution{
    public:
    static bool comp(vector<int> a,vector<int> b){
        return a[1]<b[1];
    }
    public:
    int maxMeetings(vector<int>& start, vector<int>& end){
        //your code goes here
        vector<vector<int>> m;
        for(int i=0;i<start.size();i++){
            m.push_back({start[i],end[i]});
        }
        sort(m.begin(),m.end(),comp);
        int en=m[0][1],cnt=1;
        for(int i=1;i<m.size();i++){
            if(m[i][0]>en){
                cnt++;
                en=m[i][1];
            }
        }
        return cnt;
    }
};