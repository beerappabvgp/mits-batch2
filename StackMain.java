class Stack {
    int top;
    int capacity;
    int size;
    int[] stack;
    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.size = 0;
        this.stack = new int[capacity];
    }

    public int push(int val) {
        if (isFull()) {
            System.out.println("Stack is full ... ");
            return -1;
        }
        top++;
        stack[top] = val;
        size += 1;
        return val; 
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty ... ");
            return -1;
        }
        int poppedElement = stack[top];
        top -= 1;
        size -= 1;
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty ... ");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }
}


public class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        System.out.println("peek element is: " + s.peek());
        s.push(30);
        int poppedElement = s.pop();
        System.out.println("popped Element : " + poppedElement);
        s.push(10);
        System.out.println(s.push(90));
    }
}
