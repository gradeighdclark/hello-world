import java.nio.file.spi.FileSystemProvider;

import javax.swing.JLabel;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {1,3,-64,123,9,6,20};
			selectionSort(a);
			for( int i = 0; i < a.length; i++){
				System.out.print(a[i]+ " ");
			}
	}
	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int min_idx = i; 
			for ( int j = i+1; j< arr.length; j++){
				if (arr[j]<arr[min_idx]){
					min_idx = j; 
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx]; 
			arr[min_idx] = temp; 
		}
	}

}
