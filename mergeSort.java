
public class mergeSort {
	public void sort(int[]arr, int left, int right){
		if ( left < right){ 
			int middle = (left + right)/2 ; 
			sort(arr, left,middle);
			sort(arr, middle+1, right);
			merge(arr,left,middle,right);
		}
	}
	
	public void merge(int[] arr, int l, int m, int r){
		int n1 = m - l + 1; 
		int n2 = r - m; 
		int[] L = new int[n1]; 
		int[] R = new int[n2]; 
		
		for (int i = 0; i < n1; i ++){
			L[i] = arr[i+l];
		}
		
		for (int j = 0; j < n2; j++){
			R[j] = arr[m +1 + j]; 
		}
		
		int i = 0; 
		int j = 0; 
		int k = l; 
		
		while (i < n1 && j < n2){
			if(L[i] < R[j]){
				arr[k] = L[i]; 
				i++; 
			}else{
				arr[k] = R[j]; 
				j++;
			}k++;
		}
		
		while(i < n1){
			arr[k] = L[i];
			i++; 
			k++; 
		}
		while(j < n2){
			arr[k] = R[j]; 
			j++; 
			k++;
		}
		
		
	}
	
}
