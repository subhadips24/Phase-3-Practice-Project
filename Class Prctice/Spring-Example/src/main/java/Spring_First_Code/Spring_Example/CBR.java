package Spring_First_Code.Spring_Example;

public class CBR  implements Bike{
	private String ModelNumber;
	
public void show() {
		
		System.out.println(this.ModelNumber);
		
	}
	public String getModelNumber() {
		return ModelNumber;
	}

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
		
			
}
