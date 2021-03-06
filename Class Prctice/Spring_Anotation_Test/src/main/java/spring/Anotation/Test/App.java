package spring.Anotation.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		Resource res = new ClassPathResource("spring.cfg.xml");
//		BeanFactory bf = new XmlBeanFactory(res);

		// ApplicationContext ap=new ClassPathXmlApplicationContext("spring.cfg.xml");

		ApplicationContext apc = new  AnnotationConfigApplicationContext(Config_File.class);

		CBR cbr = apc.getBean(CBR.class);

		cbr.nameComapny();
		cbr.cC();
		cbr.maxSpeed();
		cbr.emiT();
		cbr.show();
	
		System.out.println();
		R15 r15 = apc.getBean(R15.class);

		r15.nameComapny();
		r15.cC();
		r15.maxSpeed();
	
		System.out.println();
		

	}
}
