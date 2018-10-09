package day0ToDay30;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getMaximumDifference() {
        return maximumDifference;
    }

    public void setMaximumDifference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

    public Difference(int[] elements) {
        this.elements = elements;        
    }

    public void computeDifference() {
        int len = this.elements.length;
        int sz = len * len;
        int count = 0;
        int[] result = new int[sz];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    result[count] = Math.abs(elements[i] - elements[j]);
                    count++;
                }
            }
        }
        Arrays.sort(result);
        setElements(result);
        setMaximumDifference(result[sz - 1]);
    }
}

public class Day14 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
