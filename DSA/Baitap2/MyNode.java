package DSA.Baitap2;


public class MyNode {
    private static class Node{
        int data;
        Node link;
    }

    private static class Queue{
        Node front,rear;
    }

    public static void enQueue(Queue queue, int value){
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null){
            queue.front = temp;
        }else {
            queue.rear.link = temp;
        }

        queue.rear = temp;
        queue.rear.link = queue.front;
    }
    public static int deQueue(Queue queue){
        if (queue .front ==  null)
        {
            System.out.printf ("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue .front == queue .rear)
        {
            value = queue .front .data;
            queue .front =  null;
            queue .rear =  null;
        }
        else {
            Node  temp = queue .front;
            value = temp .data;
            queue .front = queue .front .link;
            queue .rear .link= queue .front;
        }
        return value;
    }

    static void displayQueue( Queue  q)
    {
        Node  temp = q .front;
        System.out.printf(" Elements in Circular Queue are: ");
        while (temp .link != q .front)
        {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }

    public static void main(String[] args) {
        Queue  q = new Queue();
        q .front = q .rear =  null;

        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, -6);

        displayQueue(q);

        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
    }
}
