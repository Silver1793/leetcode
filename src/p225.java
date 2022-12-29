class MyStack {
    Queue<Integer> queue; // creates queue

    public MyStack() {
        queue = new LinkedList<>(); // initializes queue
    }

    public void push(int x) {
        queue.add(x); // adds element to queue
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove()); // cycles through the queue and sorts elements in reverse
        }
    }

    public int pop() {
        return queue.poll(); // checks the head of the queue and removes it
    }

    public int top() {
        return queue.peek(); // gives you the element at the head of the queue
    }

    public boolean empty() {
        return queue.isEmpty(); // checks if queue is empty
    }
}