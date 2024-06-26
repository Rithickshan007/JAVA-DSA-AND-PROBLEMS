package Datastructures;

class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    QNode front;
    QNode rear;

    public Queue() {
        this.front =null;
        this.rear = null;
    }

    public void enqueue(int data) {
        QNode newNode = new QNode(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    QNode dequeue(int data) {
        if (isEmpty())
            return null;

        QNode temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp;
    }

    boolean isEmpty() {
        return front == null;
    }

    public void display(){
        QNode current=front;
        if(isEmpty()){
            return;
        }
        while (current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
}
class QueueMain{
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue(3);
        queue.display();
    }
}


