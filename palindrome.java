public class palindrome{

	public static boolean palindrome(LinkedListNode head){
		LinkedListNode step = head;
		int check = LinkedListNode.num_node % 2 == 0 ? 0 : check();
		for(int i = 0; step != null; i++){
			check = check ^ step.Value;
			step = step.nextNode;
		}
		return check == 0 ? true : false;
	}

	public static int check(){
		int index = LinkedListNode.num_node/2 + 1;
		LinkedListNode step = LinkedListNode.head;
		for(int i = 0; i < index-1; i++)
			step = step.nextNode;
		return step.Value;
	}
}
