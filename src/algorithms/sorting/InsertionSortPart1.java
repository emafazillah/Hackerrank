package sorting;

//import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPart1 {
	
	static void insertionSort1(int n, int[] arr) {
		int i = 0;
		int shift = 0;
		while(i < n - 1) {
			for(int j = 0; j < n; j++) {
				if (j < n - 1) {
					if(arr[j] > arr[j + 1]) {
						shift = arr[j + 1];
						arr[j + 1] = arr[j];
					} else { 
						if(j == 0) {
							if(arr[j] < arr[j + 1]) {
								++i;
							} else if(arr[j] == arr[j + 1] && arr[j] > shift) {
								arr[j] = shift;
								++i;
							}
						} else {
							if(arr[j] > arr[j - 1] && arr[j] < arr[j + 1]) {
								++i;
							} else if(arr[j] == arr[j + 1] && arr[j - 1] > shift) {
								arr[j] = arr[j - 1];
							} else if(arr[j] == arr[j + 1] && arr[j - 1] < shift) {
								arr[j] = shift;
								++i;
							}
						}
					}
						
				}
			}
			//System.out.println(Arrays.toString(arr));
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			if(i != n - 1) {
				i = 0;
			}
		}
    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }

}
