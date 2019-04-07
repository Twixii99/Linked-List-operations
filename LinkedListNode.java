public class LinkedListNode{
	public int Value;
	public LinkedListNode nextNode;
	static public LinkedListNode head;
	static public int num_node = 0;

	public LinkedListNode(){}

	public LinkedListNode(int Value){
		this.Value = Value;
	}

	public void getValue(){
		LinkedListNode step = head;
		for(int i = 0; step != null; i++){
			System.out.println(step.Value);
			step = step.nextNode;
		}
	}

	public void determined_value(int pool){
		LinkedListNode step = head;
		for(int i = 0; i <= pool; i++){
			if(i == pool){
				System.out.println(step.Value);
				break;
			}
			step = step.nextNode;
		}
	}

	public void determined_value_next(int pool){
		LinkedListNode step = head;
		for(int i = 0; i <= pool; i++){
			if(i == pool){
				System.out.println(step.nextNode.Value);
				break;
			}
			step = step.nextNode;
		}
	}

	public void insert(int Value, int pool){
		LinkedListNode newNode = new LinkedListNode(Value);
		if(pool == 0){
			newNode.nextNode = head;
			head = newNode;
			num_node++;
		}
		else{
			LinkedListNode i = head;
			for(int num = 0; num < pool-1; num++)
				i = i.nextNode;
			newNode.nextNode = i.nextNode;
			i.nextNode = newNode;
			num_node++;
		}
	}

	public static void main(String[] args){
		

	}
}



