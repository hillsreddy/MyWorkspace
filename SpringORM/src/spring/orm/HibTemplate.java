package spring.orm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		HibernateTemplate ht = (HibernateTemplate)container.getBean("ht");
		Emp e = new Emp();
		e.setEno(new BigDecimal(1));
		e.setEname("e1");
		e.setSalary(new BigDecimal(1000));
		ht.save(e);
		ArrayList list = (ArrayList)ht.find("from Emp");
		Iterator i = list.iterator();
		while(i.hasNext()){
			Emp e1 = (Emp)i.next();
			System.out.println(e1.getEno());
			System.out.println(e1.getEname());
			System.out.println(e1.getSalary());
		}
	}

}
