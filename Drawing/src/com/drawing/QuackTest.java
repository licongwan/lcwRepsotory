package com.drawing;

public class QuackTest {
	public static void main(String[] args) {
		int [] a = {1,13,9,8,17,15,12,4};
		quackSort(a);
		for(int value : a){
			System.out.print(value + " ");
		}
	}

	private static void quackSort(int[] a) {
		// TODO Auto-generated method stub
		sort(a,0,a.length-1);
	}
	
	private static void sort(int[] a, int left, int right){
		if(left > right){
			return;
		}
		int base = a[left];
		int i  = left;
		int j = right;
		while(i != j){
			while(base <= a[j] && i < j){
				j--;
			}
			
			while(base >= a[i] && i < j){
				i++;
			}
			if(i < j){
				int tem = a[i];
				a[i] = a[j];
				a[j] = tem;
			}
			System.out.println(a[left]);
		}
		a[left] = a[i];
		a[i] = base;
		for(int value : a){
			System.out.print(value + " ");
		}
		System.out.println();
		sort(a,left,i-1);
		sort(a,i+1,right);
	}
}
