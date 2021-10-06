import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	public void quickSort(int[] A)  {
		quickSort(A, 0, A.length-1);
	}

	private void quickSort(int[] A, int low, int high) {
		if(low < high+1) {
			int p = partition(A, low, high);
			quickSort(A, low, p-1);
			quickSort(A, p+1, high);
			
		}
	}
	
	public void swap(int[] A, int index1, int index2) {
		int temp = A[index2];
		A[index2] = A[index1];
		A[index1] = temp;
	}
	
	private int pivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high-low)+1)+low;
	}

	private int partition(int[] A, int low, int high) {
		swap(A, low, pivot(low, high));
		int border = low + 1;
		for(int i = border;i<=high;i++) {
			if(A[i] < A[low]) {
				swap(A, i, border++);
			}
		}
		
		swap(A, low, border-1);
		return border-1;
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] nums1 = new int[]{1,562,2,6,278,3,9,23};
		
		System.out.println(Arrays.toString(nums1));
		qs.quickSort(nums1);
		System.out.println(Arrays.toString(nums1));
		

	}

}
