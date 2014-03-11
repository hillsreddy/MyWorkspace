/**
 * 
 */
package com.practice;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author MadhuReddy
 *
 */
public class Triangle implements ApplicationContextAware,BeanNameAware {
	private  Point pointA;
	private  Point pointB;
	private  Point pointC;
	private List<Point> points;
	private ApplicationContext context = null;
	
	
	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}


	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}


	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}


	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}


	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}


	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("Point A = ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+","+getPointC().getY()+")");
	}


	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is :"+beanName);
		
	}
}
