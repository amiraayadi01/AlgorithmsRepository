import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting {
	

	public static int[] selectionSort(int arr[]) {
		int min_idx;
		
		for (int i = 0; i < arr.length; i++) {
			min_idx = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int[] insertionSort(int arr[]) {

		for (int i = 1; i < arr.length; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
				arr[j++] = key;
			}
			
		}
		return arr;
	}
	
    public static int[] stalinSort(int [] arr){

        arr = Arrays.copyOf(arr, arr.length);

        int i = 0;

        for (int j = 1; j < arr.length; i++, j++) {
            if (arr[i] > arr[j]) {
                i--;
            } else {
                if (j - i > 1) {
                    arr[i + 1] = arr[j];
                }
            }
        }
		return Arrays.copyOf(arr, i + 1);
    }

	public static int[] mergeSort(int[] a) {
		int length = a.length;

		if (length  == 1) {
			return a;
		}
		
		int[] l = new int[(length + 1)/2];
		int[] r = new int[length - l.length];

		for (int i = 0; i < (length/2); i++) {
			l[i] = a[i];
		}
		for (int i = (length/2); i < length; i++) {
			r[i - (length/2)] = a[i];
		}

		mergeSort(l);
		mergeSort(r);

		merge(l,r,a);
		
		return a;
	}

	public static void merge(int[] a, int[] l, int[] r) {

		int lIndex = 0, rIndex = 0, aIndex = 0;

		while (l[lIndex] < l.length && rIndex < r.length) {
			if (l[lIndex] <= r[rIndex]) {
				a[aIndex++] = l[lIndex++];
			} else {
				a[aIndex++] = r[rIndex++];
			}
		}
		
		System.arraycopy(l, lIndex, a, aIndex, l.length-lIndex);
		System.arraycopy(r, rIndex, a, aIndex, r.length -rIndex);
	}
	
	public static int[] EnhancedMergeSort(int a[]) {
			int length = a.length;
			int end = 10;
			if (length  == 1) {
				return a;
			}
			if (end == 10) {
				insertionSort(a);
				return a;
			}

			int mid = length / 2;
			int[] l = new int[mid];
			int[] r = new int[length];
			
			System.arraycopy(a, 0, l, 0, l.length);
			System.arraycopy(a, l.length, r, 0, r.length);
			mergeSort(l);
			mergeSort(r);

			if (l[l.length - 1] <= r[0]) {
				return a;
			}

			merge(l,r,a);
			return a;

		}
	// Practical 6
	public static void quickSort(int[] a, int l, int h) {
	
		if (l < h) {
			int p = partition(a, l, h);
			
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
		}

	}
	
	// Swapping 2 elements
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int partition(int[] a, int left, int right) {
		double pivot = 0;
		int leftPtr = left; 
		int rightPtr = right - 1;

		while (true) {
			while (a[++leftPtr] < pivot) 
				;
			while (a[--rightPtr] > pivot) 
				;
			if (leftPtr >= rightPtr) 
				break;
			else 
				swap(a, leftPtr, rightPtr);
		}
		swap(a, leftPtr, right - 1);
		return leftPtr;
	}

	public static int[] EnhancedQuickSort(int[] a, int l, int h) {
		int end = 10;
		
		if(h<=l + end) {
			insertionSort(a);
			return a;
		}
		if (l < h) {
			int med = medianOf3(a,l,h);
			swap(a,l,med);
			int p = partition(a, l ,h);
			EnhancedQuickSort(a, l, p - 1);
			EnhancedQuickSort(a, p + 1, h);
		}
		return a;
		
	}


	public static int medianOf3(int[] values, int left, int right) {
		int center = (left + right) / 2;
		if (values[left] > values[center])
			swap(values, left, center);
		if (values[left] > values[right])
			swap(values, left, right);
		if (values[center] > values[right])
			swap(values, center, right);

		swap(values, center, right - 1); 
		return values[right - 1]; 
	}
	
	public static int[] shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int r = (int) (Math.random() * (i + 1));
			swap(a, i, r);
		}
		return a;
	}


}