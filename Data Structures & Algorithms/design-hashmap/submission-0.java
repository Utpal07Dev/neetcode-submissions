class MyHashMap {
   class Node {
        int key;
        int val;
        Node next;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
   }

    private final int SIZE = 2069; 
    private Node[] buckets;
    public MyHashMap() {
        buckets = new Node[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new Node(-1, -1);
        }
    }

    private int getHash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        Node curr = buckets[getHash(key)];
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.val = value; 
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key,value);
    }
    
    public int get(int key) {
        Node curr = buckets[getHash(key)];
        while(curr.next!=null){
            if(curr.next.key==key){
                return curr.next.val;
            }
            curr=curr.next;

        }
        return -1;
    }
    
    public void remove(int key) {
        Node curr=buckets[getHash(key)];
        while(curr!=null && curr.next!=null){
            if(curr.next.key==key){
                curr.next  = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */