class Solution {
    public int lengthOfLongestSubstring(String s) {

        int min = 0;

        int l = 0; int r = 0;

        Map<Character, Integer> hash = new HashMap<>();


        while(r < s.length()){
            hash.put(s.charAt(r), hash.getOrDefault(s.charAt(r), 0)+1);

            while(hash.get(s.charAt(r))>1){
                
                hash.put(s.charAt(l), hash.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }

            min = Integer.max(min, r-l+1);
            

            r++;
        }

        return min;
        
    }
}
