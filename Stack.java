class stack{
    int top;
    int capacity;
    int[] arr;
    stack(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int item){
        if(top==(capacity-1)){
            System.out.println("stack is overflow ");
        }
        else{
            top++;
            arr[top]=item;
            System.out.println("Pushed " + item + " to stack.");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is underflow cannot do pop operation  ");
        }
        else{
            System.out.println(arr[top]+"it is popped");
            top--;
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("cannot peek because there is no item");
        }
        System.out.println("the top element in the stack "+arr[top]);
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.display();

        s.pop();
        s.peek();
        s.display();

        s.pop();
        s.peek();
    }
}
