package Spring_First_Code.Spring_Example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
//		Resource res = new ClassPathResource("spring.cfg.xml");
//		BeanFactory bf = new XmlBeanFactory(res);
		
		
		//ApplicationContext ap=new ClassPathXmlApplicationContext("spring.cfg.xml");
		String args1="spring.cfg.xml";
		ApplicationContext apc=new ClassPathXmlApplicationContext(args1);
		
		CBR cbr = apc.getBean(CBR.class);

		cbr.nameComapny();
		cbr.cC();
		cbr.maxSpeed();
		cbr.show();
	System.out.println();
		R15 r15 = apc.getBean(R15.class);

		r15.nameComapny();
		r15.cC();
		r15.maxSpeed();
		r15.show();

	}
}
