package Rmuti.Lab1;

import java.util.*;

public class ArrayOperation {
	private int Num[] = new int[10];

	public ArrayOperation() {
		for (int i = 0; i < Num.length; i++) {
			Num[i] = new Random().nextInt();
			System.out.print(Num[i] + " ");
		}
		System.out.println();
	}

	public int SumArrays() {
		int sum = 0;
		for (int i = 0; i < Num.length; i++) {
			sum += Num[i];
		}
		return sum;
	}

	public int MaxArrays() {
		int max = 0;
		for (int i = 0; i < Num.length; i++) {
			max = Math.max(max, Num[i]);
		}
		return max;
	}
}
