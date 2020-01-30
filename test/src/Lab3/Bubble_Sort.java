package Lab3;

public class Bubble_Sort {
	void BubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1;i++) {
			for(int j = 0;j <n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	void print(int[] arr) {
		for(int i = 0; i<arr.length	;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble_Sort b  = new Bubble_Sort();
		int[] arr = {4,5,6,2,3,1};
		b.BubbleSort(arr);
		b.print(arr);
		
	}

}
