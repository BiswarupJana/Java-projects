package Week3;

public class Queue{
    int front, rear, size;
    int capacity;
    int array[];
    public Queue(int capacity){
        this.capacity=capacity;
        front=this.size=0;
        rear=capacity-1;
        array=new int[this.capacity];
    }

    boolean isFull(Queue queue){
        return (queue.size==queue.capacity);
    }

    boolean isEmpty(Queue queue){
        return (queue.size==0);
    }

    void enQueue(int item){
        if(isFull(this))
        return;
        this.rear=(this.rear+1)%this.capacity;
    }

    int deQueue(){
        if(isEmpty(this))
        return Integer.MIN_VALUE;

        int item =this.array[this.front];
        this.front = (this.front +1)%this.capacity;
        this.size=this.size-1;
        return item;

    }
}