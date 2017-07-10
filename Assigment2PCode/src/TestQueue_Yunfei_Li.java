//Name: Yunfei Li
//Class: CS5040
//Assignment 5 - Queues(test queues)
//Term: Summer 2017
public class TestQueue_Yunfei_Li {

    public static void newLine(){
        System.out.println();
    }
    public static void main(String[] args) {
        Queue_Yunfei_Li que = new Queue_Yunfei_Li();


        //method to test enqueue
        System.out.print("Testing enqueue(e), enqueuing 5 numbers to the queue: ");
        for (int i = 1; i<=5; i++){
            que.enqueue(i);
        }
        que.printList();
        newLine();
        System.out.print("Numbers before dequeue(): ");
        que.printList();
        newLine();

        //method to test dequeue()
        System.out.print("Testing dequeue(), my numbers after dequeue(): ");
        que.dequeue();
        que.printList();
        newLine();

        //method to test front()
        System.out.print("Testing front(), the front element is: ");
        System.out.println(que.front()); //should return front of the element after removing the first element

        //method to test getSize()
        System.out.print("The size of the queue is: ");
        System.out.println(que.getSize()); //should return 4

        //method to test isEmpty()
        System.out.print("Testing isEmpty(), is the stack empty: ");
        System.out.println(que.isEmpty());
    }
}
