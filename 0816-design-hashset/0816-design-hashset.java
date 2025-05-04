class MyHashSet {
    int n = 10000;
    List<Integer>[] arr;

    public MyHashSet() {
        arr = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    public void add(int key) {
        int i = key % n;
        if (!arr[i].contains(key)) {
            arr[i].add(key);
        }
    }

    public void remove(int key) {
        int i = key % n;
        arr[i].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int i = key % n;
        return arr[i].contains(key);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
