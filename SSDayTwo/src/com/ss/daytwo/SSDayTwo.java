/**
 * 
 */
package com.ss.daytwo;

import java.util.Scanner;
import java.util.*;

/**
 * @author Tkat
 *
 */
public class SSDayTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any numbers, type a number 0 or below to stop.");
		List<Integer> arr = new ArrayList<Integer>();
		while(true) {
			Scanner nums = new Scanner(System.in);
			int num = nums.nextInt();
			if(num <= 0) {
				break;
			}else{
				arr.add(num);
			}
		}
		int sum = 0;
		for(int arg : arr) {
			sum += arg;
		}
		System.out.println(sum);

		System.out.print("How many arrays would you like to have? ");
		Scanner num = new Scanner(System.in);
		int arrays = num.nextInt();
		int[] nums = new int[arrays];
		int most = 0; 
		for(int x=1; x<=arrays; x++){
			System.out.print("How many numbers would you like in array " + x + "? ");
			nums[x-1] = num.nextInt();
			if(nums[x-1] > most) {
				most = nums[x-1];
			}
		}
		System.out.println("Now lets enter some numbers!");
		int[][] numArray = new int[arrays][most];
		int max = -100;
		int xPos = 0;
		int yPos = 0;
		for(int x=0; x<arrays; x++) {
			for(int y=0; y<nums[x]; y++) {
				numArray[x][y] = num.nextInt(); 
				if(numArray[x][y] > max) {
					max = numArray[x][y];
					xPos = x;
					yPos = y;
				}
			}
		}
		System.out.println("The max number in these arrays is " + max + ". It is in position [" + xPos + "][" + yPos + "].");
		System.out.println();
		Scanner shape = new Scanner(System.in);
		System.out.println("Rectangle");
		System.out.print("Height: ");
		int RecH = shape.nextInt();
		System.out.print("Width: ");
		int RecW = shape.nextInt();		
		System.out.println("Triangle");
		System.out.print("Height: ");
		int TriH = shape.nextInt();
		System.out.print("Base: ");
		int TriB = shape.nextInt();
		System.out.println("Circle");
		System.out.print("Radius: ");
		int CirR = shape.nextInt();
		Rectangle rec = new Rectangle(RecH, RecW);
		Triangle tri = new Triangle(TriH, TriB);
		Circle cir = new Circle(CirR);
		rec.Display();
		tri.Display();
		cir.Display();
	}

}
