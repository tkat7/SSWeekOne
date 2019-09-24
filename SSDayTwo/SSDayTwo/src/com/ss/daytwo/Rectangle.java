/**
 * 
 */
package com.ss.daytwo;

/**
 * @author Tkat
 *
 */
public class Rectangle implements Shapes {

	public Rectangle(double w, double h) {
		height = h;
		width = w;
	}
	/**
	 * @param args
	 */
	double width;
	double height;
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle: " + this.CalculateArea());
	}

}
