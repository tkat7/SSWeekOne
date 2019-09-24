/**
 * 
 */
package com.ss.dayone;

/**
 * @author Tkat
 *
 */
public class SSDayOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)");
		int x, y;
		for(x=1; x<=4; x++) {
			for(y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(".........");
		System.out.println();
		System.out.println("2)");
		System.out.println("..........");
		for(x=4; x>=1; x--) {
			for(y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3)");
		
		for(x=1; x<=4; x++) {
			for(y=6-x; y>0; y--) {
				System.out.print(" ");
			}
			for(y=x; y>0; y--) {
				if(y==1) {
					System.out.print("*");
				}else {
					
				System.out.print("**");
				}
			}
			System.out.println();
		}
		System.out.println("...........");
		System.out.println();
		System.out.println("4)");
		System.out.println("............");
		for(x=4; x>=1; x--) {
			for(y=6-x; y>0; y--) {
				System.out.print(" ");
			}
			for(y=x; y>0; y--) {
				if(y==1) {
					System.out.print("*");
				}else {
					
				System.out.print("**");
				}
			}
			System.out.println();
		}
	}

}
