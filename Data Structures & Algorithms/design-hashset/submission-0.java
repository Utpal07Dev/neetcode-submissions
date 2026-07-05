class MyHashSet {
    static int bucket_size = 1009;
    LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[bucket_size];
        for (int i = 0; i < bucket_size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    private int hash(int key){
        return Math.abs(key)%bucket_size;
    }
    
    public void add(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];

        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
      
        bucket.remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */