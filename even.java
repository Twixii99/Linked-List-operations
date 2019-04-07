public class even{


	public static LinkedListNode evenIndexedElements(LinkedListNode head){
		LinkedListNode join = head, join2 = head;
		for(int k = 0; k < LinkedListNode.num_node/2 && join2 != null; k++){
			join2 = join2.nextNode.nextNode;
			join.nextNode = join2;
			join = join2;
		}
		return head;
	}
}
