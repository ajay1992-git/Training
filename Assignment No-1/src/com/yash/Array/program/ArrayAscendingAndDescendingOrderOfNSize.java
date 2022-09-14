package com.yash.Array.program;

public class ArrayAscendingAndDescendingOrderOfNSize {
	
	static void printOrder(int[] a, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size / 2; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }



           }
            for (int j = size / 2; j < size - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;



               }
            }
        }
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + ",");
    }
}
