class MyHashMap extends HashMap<Integer, Integer>{
    
    public int get(int key) {
        Integer value = super.get(key);
        return value == null ? -1 : value;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */