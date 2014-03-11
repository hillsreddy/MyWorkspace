package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is :("+center.getX()+","+center.getY()+")");
		
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	//@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	

}
