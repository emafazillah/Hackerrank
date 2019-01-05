package implemetation;

//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CavityMap {

	// Complete the cavityMap function below.
	static String[] cavityMap(String[] grid) {
		// Initialise new grid
		String[] gridNew = new String[grid.length];
		for (int i = 0; i < gridNew.length; i++) {
			gridNew[i] = "";
		}
		
		for (int i = 0; i < grid.length; i++) {
            //System.out.println("grid[" + i + "]===" + grid[i]);
        	if (i > 0 && i < grid.length - 1) {
        		for (int j = 0; j < grid[i].length(); j++) {
                	//System.out.println("grid[" + i + "]["+ j +"]===" + grid[i].charAt(j));
                	if (j > 0 && j < grid[i].length() - 1) {
                		// Replace with "X" if find cavity
                		if (grid[i].charAt(j) > grid[i].charAt(j - 1) && 
                				grid[i].charAt(j) > grid[i].charAt(j + 1) && 
                				grid[i].charAt(j) > grid[i - 1].charAt(j) && 
                				grid[i].charAt(j) > grid[i + 1].charAt(j)) {
                			//System.out.println("grid[" + i + "]["+ j +"]===" + grid[i].charAt(j));
                			gridNew[i] += "X";
                		} else {
                			gridNew[i] += Character.toString(grid[i].charAt(j));
                		}
                	} else {
                		gridNew[i] += Character.toString(grid[i].charAt(j));
                	}
                }
        	} else {
        		gridNew[i] = grid[i];
        	}
        	//System.out.println("gridNew[" + i + "]" + gridNew[i]);
        }

        return gridNew;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] grid = new String[n];

		for (int i = 0; i < n; i++) {
			String gridItem = scanner.nextLine();
			grid[i] = gridItem;
		}

		String[] result = cavityMap(grid);

		for (int i = 0; i < result.length; i++) {
			//bufferedWriter.write(result[i]);
			System.out.print(result[i]);

			if (i != result.length - 1) {
				//bufferedWriter.write("\n");
				System.out.println();
			}
		}

		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
