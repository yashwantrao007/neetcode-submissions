class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

       Map<Character, Integer> hashS = new HashMap<>();
       Map<Character, Integer> hashT = new HashMap<>();

       for(int i = 0; i<s.length(); i++){
        char c = s.charAt(i);
        hashS.put(c, hashS.getOrDefault(c, 0) + 1);
       }

       for(int i = 0; i<t.length(); i++){
        char c = t.charAt(i);
        hashT.put(c, hashT.getOrDefault(c, 0) + 1);
       }

       for(int i = 0;i< s.length(); i++){
         char m = s.charAt(i);
         if(!hashS.get(m).equals(hashT.get(m))  ){
            return false;
         }
       }


        
        return true;
    }
}
