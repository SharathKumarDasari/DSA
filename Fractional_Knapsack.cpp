class Solution {
public:
    static bool comp(vector<long long> a,vector<long long> b){
        return ((double)a[0]/a[1])>((double)b[0]/b[1]);
    }
public:
    double fractionalKnapsack(vector<long long>& val, vector<long long>& wt, long long capacity) {
        // Your code goes here
        vector<vector<long long>> k;
        for(int i=0;i<val.size();i++){
            k.push_back({val[i],wt[i]});
        }
        sort(k.begin(),k.end(),comp);
        double maxp=0;
        for(int i=0;i<val.size();i++){
            if(k[i][1]<=capacity){
                capacity-=k[i][1];
                maxp+=k[i][0];
            }
            else{
                maxp+=(((double)k[i][0]/k[i][1])*capacity);
                break;
            }
        }
        return maxp;
    }
};

/*
	Fractional Knapsack

You have n items; 
the i-th item has value val[i] and weight wt[i].

A knapsack can carry at most capacity units of weight.



You may take any fraction of an item (i.e. split items).

Return the maximum total value that can be placed in the knapsack, rounded to exactly 6 decimal places.


Example 1

Input: val = [60,100,120], wt = [10,20,30], capacity = 50

Output: 240.000000

Explanation:

 • Take item 0 (w=10, v=60)

 • Take item 1 (w=20, v=100)

 • Take 2⁄3 of item 2 (w=20, v=80)

Total value = 60 + 100 + 80 = 240

Example 2

Input: val = [60,100], wt = [10,20], capacity = 50

Output: 160.000000

Explanation: Both items fit entirely (total weight 30 ≤ 50).

Constraints

1 ≤ n = val.length = wt.length ≤ 105
1 ≤ capacity ≤ 109
1 ≤ val[i], wt[i] ≤ 10 000
*/