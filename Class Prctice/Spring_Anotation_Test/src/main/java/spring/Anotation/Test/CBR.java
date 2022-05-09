package spring.Anotation.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CBR  implements Bike{
	private String ModelNumber;
	
public void show() {
		
		System.out.println(this.ModelNumber);
		
	}
	public String getModelNumber() {
		return ModelNumber;
	}
	@Required
	@Value("CBR120_2022")
	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public void nameComapny() {
		// TODO Auto-generated method stub
		System.out.println("HONDA...");
	}

	public void cC() {
		// TODO Auto-generated method stub
		System.out.println("220 cc bike");
	}


	public void maxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("250 km/hr");
	}
	@Autowired
		public R15 emi;
		
		public void emiT() {
				emi.Price();
			}

			
}
