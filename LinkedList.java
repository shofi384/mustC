public class LinkedList
{
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public void add(int data) {
		Node node = new Node(data);
		if(head == null)
			head = node;
		else {
			node.setNextNode(head);
			head = node;
		}
	}

	private void removeEven() {
		if (this.head==null) return;

		Node prev=null, curr = head;

		while(curr != null) {
			if(curr.data%2 == 0) {
				if(prev == null) {
					Node temp = curr;
					curr = curr.getNextNode();
					head = curr;
					temp.setNextNode(null);
				}
				else {
					Node temp = curr;
					curr = curr.getNextNode();
					prev.setNextNode(curr);
					temp.setNextNode(null);
				}
			}
			else{
				prev = curr;
				curr = curr.getNextNode();
			}
		}
	}

	public void print() {
		if(head == null) return;

		Node curr = head;
		while(curr != null) {
			System.out.println(curr);
			curr = curr.getNextNode();
		}
	}

	public static void main(String[] args)
	{
		LinkedList h = new LinkedList();
		h.add(10);
		h.add(10);
		h.add(11);
		h.add(8);
		h.add(10);
		h.add(10);
		h.add(9);
		h.add(12);
		h.add(14);
		h.add(13);
		h.add(9);
		h.add(12);
		h.removeEven();
		h.print();
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this(data, null);
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public void setNextNode(Node next) {
		this.next = next;
	}

	public Node getNextNode() {
		return this.next;
	}

	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}
