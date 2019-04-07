public class re{
	public static LinkedListNode removeCentralNode(LinkedListNode head){
		int index = LinkedListNode.num_node%2 == 0 ? LinkedListNode.num_node/2 : LinkedListNode.num_node/2 + 1;
		LinkedListNode step = head, step2 = null;
		if(head == null)
			return null;
		for(int i = 0; i < index-1; i++){
			if(i == index-2)
				step2 = step;
			step = step.nextNode;
		}
		step2.nextNode = step.nextNode;
		LinkedListNode.num_node--;
		return head;
	}
}
