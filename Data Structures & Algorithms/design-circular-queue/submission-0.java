class MyCircularQueue {
        int front;
        int back;
        int[]q ;
        int size;
    public MyCircularQueue(int k) {
        q = new int[k];
        size=k;
        front = -1;
        back = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
        }
        back = (back+1)%size;
        q[back] = value;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front ==back){
            back = -1;
            front = -1;
        }else{
            front = (front + 1) % size;
        }
        
        return true;

    }
    
    public int Front() {
        if(isEmpty())return -1;
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return q[back];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return (back+1)%size == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */