package Spring_First_Code.Spring_Example;

public class R15  implements Bike{

	private String detailsBike;
	
	
	public void show() {
		
		System.out.println(this.detailsBike);
		
	}
	public R15(String detailsBike) {
		
		this.detailsBike = detailsBike;
	}


	public void nameComapny() {
		// TODO Auto-generated method stub
		System.out.println("Yamha...");
	}

	
	public void cC() {
		// TODO Auto-generated method stub
		System.out.println("250 cc bike");
	}

	public void maxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("200 km/hr");
	}
		
}
