package implemetation;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CavityMap {

	// Complete the cavityMap function below.
	static String[] cavityMap(String[] grid) {
		
		return null;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] grid = new String[n];

		for (int i = 0; i < n; i++) {
			String gridItem = scanner.nextLine();
			grid[i] = gridItem;
		}

		String[] result = cavityMap(grid);

		for (int i = 0; i < result.length; i++) {
			//bufferedWriter.write(result[i]);

			if (i != result.length - 1) {
				//bufferedWriter.write("\n");
			}
		}

		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
