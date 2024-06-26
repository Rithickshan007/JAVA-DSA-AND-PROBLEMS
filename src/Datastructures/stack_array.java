package Datastructures;


///Stack using Arrays
///Methods pop(),push(),peek()

class ArrayStack{
    int top;
    int capacity;
    int [] stackArray;

    public ArrayStack(int capacity){
        stackArray=new int[capacity];
        this.capacity=capacity;
        top--;
    }

    void push(int val){

        if(isFull()){
            System.out.println("Stack is overflowed...cannot push elements");
        }
        stackArray[++top]=val;
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Underflow...Cannot pop elements");
            return;
        }
        top--;
    }

    int peek(){
        return stackArray[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==capacity-1;
    }
    void display() {
        if (top==-1) {
            System.out.println("Stack is empty.");
        }
        System.out.print("Stack elements are: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public int popAtAnyIndex(int index){
        if(isEmpty()||top<0||index>top){
            System.out.println("Array is empty or invalid index");
            return  -1;
        }
        int removed_element=stackArray[index];
        for (int i=index;i<top;i++){
            stackArray[i]=stackArray[i+1];
        }
        top--;
        return removed_element;

    }
    }

class Main{
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(6);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);

        stack.display();
        System.out.println("The peek element is: "+stack.peek());
        stack.pop();
        stack.display();
        System.out.println("Popped element in index: "+ stack.popAtAnyIndex(1));
        stack.display();
    }
}







