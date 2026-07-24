class Queue {
    int front;
    int back;
    int[] queue;
    int size;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.back = -1;
        this.size = 0;
        this.queue = new int[capacity];
    }

    public int enqueue(int val) {
        if (isFull()) {
            System.out.println("queue is full .... ");
            return -1;
        }
        back++;
        queue[back] = val;
        size += 1;
        return val;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty ... ");
            return -1;
        }
        int poppedElement = queue[front];
        front += 1;
        if (size == 0) {
            front = 0;
            back = -1;
        } 
        return poppedElement;
    }

    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}


public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int poppedValue = q.dequeue();
        System.out.println("popped value is : " + poppedValue);
        q.enqueue(40);  
    }
}
