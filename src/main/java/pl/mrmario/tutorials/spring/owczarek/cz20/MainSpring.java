package pl.mrmario.tutorials.spring.owczarek.cz20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		System.out.println(someBean.getProperty());
		DatabaseRepository myDb = context.getBean("myDB", DatabaseRepository.class);
		System.out.println(myDb);
		
	}
}