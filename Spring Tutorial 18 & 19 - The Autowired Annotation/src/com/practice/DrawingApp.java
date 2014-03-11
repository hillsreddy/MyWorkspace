/**
 * 
 */
package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MadhuReddy
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("circle");//triangle or circle
		shape.draw();
	}

}
