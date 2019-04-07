public class reverse{

	public static LinkedListNode revarse(LinkedListNode head){
		LinkedListNode step = head;
		int values[] = new int [LinkedListNode.num_node];
		for(int i = 0; i < LinkedListNode.num_node; i++){
			values[i] = step.Value;
			step = step.nextNode;
			System.out.println(values[i]);
		}
		step = head;
		for(int i = LinkedListNode.num_node-1; i >= 0; i--){
			step.Value = values[i];
			step = step.nextNode;
		}
		return head;
	}
}
