class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0; int r = 0;
        int max = 0;
        int maxFreq = 0;

        Map<Character, Integer> hashMap = new HashMap<>();

        while(r<s.length()){
            hashMap.put(s.charAt(r), hashMap.getOrDefault(s.charAt(r), 0)+1);

            maxFreq = Math.max(maxFreq, hashMap.get(s.charAt(r)));

            while((r-l+1)-maxFreq >k){
                hashMap.put(s.charAt(l), hashMap.getOrDefault(s.charAt(l), 0)-1);
                l++;
            }

            max = Math.max(max, r-l+1);
            

            r++;
        }

        return max;
        
    }
}
