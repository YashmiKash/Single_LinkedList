package src;

public class SingleLinkedList {
	    // Node class to represent each element in the linked list
	    class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Head of the linked list
	    private Node head;

	    public SingleLinkedList() {
	        this.head = null;
	    }

	    // Method to insert a new node at the end of the linked list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	current.next = newNode;
	        }
	    }

	    // Method to display the linked list
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	SingleLinkedList list = new SingleLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.display();
	    }
	}


