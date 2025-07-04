package com.basic;

public class bro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int a = 1; a<=rows; a++) {
			for (int b = 1; b <=rows-a; b++) {
				System.out.print(" " + " ");
			}
			for(int b = 1; b<=a;b++) {
				System.out.print("*" + " ");
			}
			for (int b =1; b<=a-1;b++ ) {
				System.out.print("*"+" ");
			}
		System.out.println( );
		}
    }
}