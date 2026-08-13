class TimeMap {
     Map<String,TreeMap<Integer, String>> hashMap;

    public TimeMap() {

       hashMap = new HashMap<>();
        
        
    }
    
    public void set(String key, String value, int timestamp) {

        hashMap.putIfAbsent(key,new TreeMap<>());
        hashMap.get(key).put(timestamp,value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!hashMap.containsKey(key)) return "";
        Integer floorKey = hashMap.get(key).floorKey(timestamp);
        return floorKey == null ? "" : hashMap.get(key).get(floorKey);
    }
}
