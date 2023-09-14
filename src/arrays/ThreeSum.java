package arrays;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,-6,3,8,-1,-1,8,-11,-1};
		int target=0;
		solution(arr, target, arr.length);
				
	}
	
	public static void solution(int[] a, int target ,int n) {
		//sort the array
		//as we want unique triplets
		
		Arrays.sort(a);
		for (int i=0;i<n;i++) {
			if(i==0 || (a[i] != a[i-1])) {
				int j=i+1, k=n-1;
				// find a num to get a pair , whose sum is equal to tar
				int tar=target-a[i];
				//two pointer approach
				while(j<k) {
					if(a[j]+a[k]==tar) {
						System.out.println("Pair whose sum is equal to "+ target + "["+ a[i]+","+ a[j]+","+a[k]+"]");
						//ignore duplicates
						//while(j<k && a[j]==a[j+1]) j++;
						//while(j<k && a[k]==a[k-1]) k--;
						
						j++;
						k--;
						
					}else if(a[j]+a[k]<tar) {
						j++;
					}else {
						k--;
					}
					
				}
			}
		}
		
	}
}