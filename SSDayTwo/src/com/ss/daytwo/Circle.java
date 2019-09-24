/**
 * 
 */
package com.ss.daytwo;

/**
 * @author Tkat
 *
 */
public class Circle implements Shapes{

	public Circle(double r) {
		radius = r;
	}
	/**
	 * @param args
	 */
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.PI*radius);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Circle: " + this.CalculateArea());
	}

}
