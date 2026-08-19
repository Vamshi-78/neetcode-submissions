class TimeMap {
    private Map<String,TreeMap<Integer,String>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
            map.putIfAbsent(key, new TreeMap<>());
            TreeMap<Integer,String> tree=map.get(key);
            tree.put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";

        TreeMap<Integer,String> tree=map.get(key);

        Map.Entry<Integer,String> entry=tree.floorEntry(timestamp);

        if(entry==null)
        return "";

        return entry.getValue();
    }
}
