class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        backTrackFunc(s, ans, curr, 0);

        return ans;
        
    }

    private void backTrackFunc(String s, List<List<String>> ans, List<String> curr, int index){

        //base
        if(index == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = index; i<s.length(); i++){
            if(palindrome(s, index, i)){
                curr.add(s.substring(index, i+1));
                backTrackFunc(s, ans, curr, i+1);
                curr.remove(curr.size()-1);

            }
        }

    }
    private boolean palindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
