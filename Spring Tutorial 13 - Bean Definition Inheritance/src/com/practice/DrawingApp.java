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
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");*/
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();
	}

}
