import java.util.Arrays;

public class MySpecialLinkedListUtils{

	public MySpecialLinkedListUtils(){}


	public static double[] summary(LinkedListNode head){

		int num = LinkedListNode.num_node;
		LinkedListNode average = new LinkedListNode();
		int sum = 0; double aver, median;
		int arr[] = new int[num];
		LinkedListNode step = head;
		for(int i = 0; i < num; i++){
			arr[i] = step.Value;
			step = step.nextNode;
		}
		Arrays.sort(arr);
		for(int i = 0; i < num; i++)
			sum += arr[i];

		aver = (double)sum / num;

		int index = num / 2;
		median = num % 2 == 0 ? (arr[index] + arr[index-1]) / 2 : arr[index];

		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		return(new double[]{sum, aver, median, arr[num-1], arr[0]});
	}
}
