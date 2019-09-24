/**
 * 
 */
package com.ss.daytwo;

/**
 * @author Tkat
 *
 */
public class Triangle implements Shapes{

	public Triangle(double b, double h) {
		height = h;
		base = b;
	}
	/**
	 * @param args
	 */
	double base;
	double height;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return (height*base)/2;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Triangle: " + this.CalculateArea());
	}
	

}
