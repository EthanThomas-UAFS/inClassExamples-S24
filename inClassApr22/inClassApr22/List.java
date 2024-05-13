package inClassApr22;

public class List {
	private Node head;
	
	public List() {
		this.head=null;
	}
	
	public void add(String value) {
		Node temp = head;
		Node newNode = new inClassApr22.Node(value,null);
		
		if(head==null) {
			head=newNode;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void remove(String value){
		Node temp = head;
		Node previous = temp;
		Node toRemove = temp;
		Node after;
		boolean found = false;

		while(temp!=null){
			if(temp.value == value){
				toRemove = temp;
				found = true;
			}else if(found == false){
				previous = temp;

			}else if(found == true){
				after = temp;
			}



		}

	}

	public void push(String str){
		Node newNode = new Node(str,null);
		newNode.next = this.head
	}

	public void show(){
		Node temp = head;
		
		if(temp==null) {
			System.out.printf("(Empty List)\n");
		}
		while(temp!=null) {
			System.out.printf("%s\n", temp.value);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		List list1 = new List();
		
		list1.show();
		
		list1.add("Bill");
		list1.add("Mary");
		list1.add("Joe");
		
		list1.show();
		
	}

}
