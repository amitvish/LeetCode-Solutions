class MyHashSet {
    private boolean[] hashPool;

    public MyHashSet() {
        hashPool = new boolean[1000001];
        Arrays.fill(hashPool, false);
    }

    public void add(int key) {
        hashPool[key] = true;
    }

    public void remove(int key) {
        hashPool[key] = false;
    }

    public boolean contains(int key) {
        return hashPool[key];
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
