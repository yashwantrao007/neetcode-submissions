class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();


        backTrack(ans,0,0,n,"");

        return ans;
        
    }
    public void backTrack(List<String> ans, int open, int close, int n, String s){
        if(open == close && open+close == 2*n){
            ans.add(s);
            return;
        }

        if(open<n){
            backTrack(ans,open+1,close,n,s+"(");
        }

        if(close<open){
            backTrack(ans,open,close+1,n,s+")");
        }
    }
}
