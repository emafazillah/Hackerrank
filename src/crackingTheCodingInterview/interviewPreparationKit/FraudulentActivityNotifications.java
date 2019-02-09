package interviewPreparationKit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FraudulentActivityNotifications {
	
	// Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
    	// Create list to calculate median later
		List<Integer> list = new ArrayList<>();
		
		int countNotification = 0;
    	int offset = 0;
    	while((d + offset) < expenditure.length) {
    		int expenditureValue = expenditure[d + offset];
    		int j = 0;
			while(j < d) {
				list.add(expenditure[offset + j]);
				++j;
			}
			
			// Sort list
			Collections.sort(list);
			
			// Calculate median
			double med = 0D;
			double pos1 = Math.floor((list.size() - 1) / 2.0);
			double pos2 = Math.ceil((list.size() - 1) / 2.0);
			if(pos1 == pos2) {
				med = list.get((int) pos1);
			} else {
				med = (list.get((int) pos1) + list.get((int) pos2)) / 2.0;
			}
			
			// Send notification if expenditureValue equal or greater than 2 x median
			if(expenditureValue >= (2 * med)) {
				++countNotification;
			}
			
			// increase offset
			// clear list
			++offset;
			list.clear();
    	}

    	return countNotification;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        
        System.out.println(result);

        scanner.close();
    }

}
