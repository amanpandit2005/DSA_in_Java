package L41_L42_Queue;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Implementation_via_LinkedList {
    public static class QueueUsingLinkedList {
        Node head = null;
        Node tail = null;

        // ADD (Enqueue)
        void add(int data) {
            Node newNode = new Node(data);

            if (tail == null) {   // Queue is empty
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // REMOVE (Dequeue)
        void remove() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return;
            }

            head = head.next;

            if (head == null) {  // Queue becomes empty
                tail = null;
            }
        }

        // PEEK (Front element)
        void peek() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("Front element: " + head.data);
        }

        // DISPLAY
        void display() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = head;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Main method
        public static void main(String[] args) {
            QueueUsingLinkedList q = new QueueUsingLinkedList();

            q.add(10);
            q.add(20);
            q.add(30);

            q.display();  // 10 20 30

            q.peek();     // 10

            q.remove();
            q.display();  // 20 30
        }
    }

}
