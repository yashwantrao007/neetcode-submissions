class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0; i<strs.length; i++){
            if(!visited[i]){

            List<String> subRes = new ArrayList<>();

            subRes.add(strs[i]);
            visited[i] = true;

            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            for(int j = i+1; j<strs.length; j++){

                if(!visited[j]){

                
                char[] arr1 = strs[j].toCharArray();
                Arrays.sort(arr1);
                String sorted1 = new String(arr1);

                if(sorted1.equals(sorted)){
                    subRes.add(strs[j]);
                    visited[j] = true;
                }
                }
            }

            result.add(subRes);

        }
            

            
            
        }

        return result;
        
    }
}
