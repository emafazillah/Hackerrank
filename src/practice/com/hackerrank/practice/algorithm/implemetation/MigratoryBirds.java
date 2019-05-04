package com.hackerrank.practice.algorithm.implemetation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		for (int types_i = 0; types_i < n; types_i++) {
			types[types_i] = in.nextInt();
		}
		Arrays.sort(types);
		int currentBirdCount = 1;
		int highestCount = 0;
		int currentBird = types[0];
		int mostFrequent = types[0];

		for (int i = 0; i < n - 1; i++) {
			currentBird = types[i];
			if (types[i] == types[i + 1]) {
				currentBirdCount++;
				if (currentBirdCount > highestCount) {
					highestCount = currentBirdCount;
					mostFrequent = currentBird;
				}
			} else {
				currentBirdCount = 1;
			}
		}
		System.out.println(mostFrequent);
		in.close();
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k1).compareTo(map.get(k2));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

}
