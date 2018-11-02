import javax.naming.ldap.SortControl;

public class QuickSort {
	public void sort(int[] arr, int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
	public int partition(int[] arr,int low, int high){
		int pivot = arr[high]; 
		int i = low - 1; 
		for(int j = low; j < arr.length; j++){
			if (arr[j] < pivot){
				i++;
				int temp = arr[j]; 
				arr[j] = arr[i]; 
				arr[i] = temp; 
			}
		}
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 
		
		return i+1; 
	}
}
