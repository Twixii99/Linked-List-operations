public class reverse2{

	public static LinkedListNode reverse(LinkedListNode head){
		LinkedListNode i = head, j = head;
		while(j.nextNode != null)
			j = j.nextNode;
		LinkedListNode k = j;
		while(j != head){
			while(i.nextNode != j)
				i = i.nextNode;
			j.nextNode = i;
			j = j.nextNode;
			i = head;
		}
		j.nextNode = null;
		return k;
	}
}
