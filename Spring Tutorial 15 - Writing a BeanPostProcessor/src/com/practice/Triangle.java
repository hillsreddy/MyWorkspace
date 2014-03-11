/**
 * 
 */
package com.practice;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author MadhuReddy
 *
 */
public class Triangle implements InitializingBean, DisposableBean {
//public class Triangle{
	private  Point pointA;
	private  Point pointB;
	private  Point pointC;
	

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
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroymethod called for Triangle");
		
	}
	public void myInit(){
		System.out.println("myInit method called for Triangle");
	}
	public void myDestroy(){
		System.out.println("myDestroy method called for Triangle");
	}
}
