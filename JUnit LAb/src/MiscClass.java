import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MiscClass {

	static <T> T[] append(T[] arr, T element) {
		final int N = arr.length;
		arr = Arrays.copyOf(arr, N + 1);
		arr[N] = element;
		return arr;
	}

	public int[] CopyArray(int[] arr) {
		int[] new_array = new int[10];

		for (int i = 0; i < arr.length; i++) {
			new_array[i] = arr[i];
		}
		return new_array;
	}

	public String[] FindCommonElemet(String[] arr1, String[] arr2) {
		String[] arr = {};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr = append(arr, arr[i]);
					System.out.println(Arrays.toString(arr));
					break;
				}
			}
		}

		return arr;
	}

	public int[] removeDuplicates(int a[]) {
		int n = a.length;
		int[] temp = new int[n];
		if (n == 0 || n == 1) {
			return temp;
		}

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		// Changing the original array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return temp;
	}


	public int[] removeSpecific(int arr[],int j) {
        int[] arr_new = new int[arr.length-1];
        
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }

		return arr_new;
	}

}
