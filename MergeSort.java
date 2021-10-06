
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[]{1,562,2,6,278,3,9,23};
		mergeSort(nums1);
		
		for(int num : nums1) {
			System.out.println(num);
		}
		
		System.out.println();
		
	}
	
	public static void mergeSort(int[] nums) {
		
		int inputLength = nums.length;
		
		
		if(inputLength < 2) {
			return;
		}
		
		int midpoint = nums.length/2;
		
		int[] leftHalf = new int[midpoint];
		int[] rightHalf = new int[nums.length-midpoint];
		
		for(int i=0;i<midpoint;i++) {
			leftHalf[i] = nums[i];
		}
		
		for(int j=midpoint;j<nums.length;j++) {
			rightHalf[j-midpoint] = nums[j];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		// merge
		
		merge(nums, leftHalf, rightHalf);
		

		
	}
	
	public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
		
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		 
		while(i < leftSize && j <rightSize) {
			if(leftArray[i] <= rightArray[j]) {
				inputArray[k] = leftArray[i];
				i++;
			} else {
				inputArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		//  edge case - check for spill over from the array 
		while(i<leftSize) {
			inputArray[k] = leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			inputArray[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
}
