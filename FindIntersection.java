package Week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		for (int i = 0; i < len1; i++) {
			
			for (int j = 0; j < len2; j++) {
				
				if(arr1[i] == arr2[j]) {
				System.out.println("Matched item in first array is : "+arr1[i]);
				}
				
			}
			
		}

	}

}