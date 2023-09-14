package arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {11,3,47,9,14,2};
		int target=17;
		int ans[]= new int[2];

		//general code having time complexity o(n2)
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//			int s=arr[i]+arr[j];
//			if(s==target)
//				{
//					ans[0]=i;
//					ans[1]=j;
//					break;
//				}
//			}
//		}
		
		//optimising this code using hashmap
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			// subtraction of target number and number from array gives a answer 
			//which we need to check it with remaining element
			//if it found means pair exists 
			int num=target-arr[i];
			if(map.containsKey(num)) {
				ans[1]=i;
				ans[0]=map.get(num);
				break;
			}
			map.put(arr[i],	i);
		}
		System.out.println("answer is : ["+ans[0]+ "," +ans[1]+"]");
	}

}
