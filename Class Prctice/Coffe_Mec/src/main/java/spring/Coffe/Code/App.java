package spring.Coffe.Code;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    			Scanner sc = new Scanner(System.in);
    			ApplicationContext ap=new ClassPathXmlApplicationContext("coffe.cfg.xml");
    			
    			
    			while(true) {
    					
    				System.out.println("Press 1 for Capachino..");
    				System.out.println("&&");
    				System.out.println("Press 2 for Xpressso....");
    				System.out.println("&&");
    				System.out.println("For exit preess 3");
    				
    				System.out.println();
    				int choise1=sc.nextInt();
    					switch (choise1) {
						case 1:
							
							Capachino cp=ap.getBean(Capachino.class);
							cp.testeOfCoffe();
							cp.costOfCoffe();
							System.out.println();
							System.out.println("Do you want crem ");
							System.out.println("if Yes Press 1 and For No Press 2");
							int x=sc.nextInt();
							if(x==1) {
								cp.withCream();
								System.out.println();
							}else {
								cp.withOutCream();
								System.out.println();
							}
							System.out.println("--------------------------------------------------------");
							break;
							
						case 2:
							Xpresso xp=ap.getBean(Xpresso.class);
							xp.testeOfCoffe();
							xp.costOfCoffe();
							System.out.println();
							System.out.println("Do you want crem ");
							System.out.println("if Yes Press 1 and For No Press 2");
							int y=sc.nextInt();
							if(y==1) {
								xp.withCream();
								System.out.println();
							}else {
								xp.withOutCream();
								System.out.println();
							}
							System.out.println("--------------------------------------------------------");
							break;
							
						case 3:
							System.out.println("Thank You... For use Service");
							System.out.println("--------------------------------------------------------");
							System.exit(0);
							break;
						}
    			}
    }
}
