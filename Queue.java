class Queue {
    int rear = -1;
    int front = 0;
    int[] arr = new int[5];
    int size = 0;

    void enqueue(int item) {
        if (size == arr.length) {
            System.out.println("Queue is full.");
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = item;
            size++;
            System.out.println("enqueue " + item + " to queue.");
        }
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot do dequeue operation.");
            return -1;
        } else {
            int item = arr[front];
            front = (front + 1) % arr.length;
            size--;
            System.out.println("dequeue " + item + " from queue.");
            return item;
        }
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            System.out.println("Front element is: " + arr[front]);
            return arr[front];
        }
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % arr.length;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();
        q.dequeue();
        q.display();

        q.peek();
        q.display();
    }
}

