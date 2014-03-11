/**
 * 
 */
package com.practice;

import org.springframework.context.support.AbstractApplicationContext;
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
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
