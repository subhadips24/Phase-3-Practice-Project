package spring.Coffe.Code;

public class Xpresso implements CoffeMachine {
	private String  Cream;
	
	public String getCream() {
		return Cream;
	}

	public void setCream(String cream) {
		Cream = cream;
	}
	public void withCream() {
		System.out.println(Cream);
	}
	public void withOutCream() {
		System.out.println(" Your Xpresso Without Cream");
	}

	public void testeOfCoffe() {
		System.out.println("Make you full Enjoy with Xpresso Coffe..");
		
	}

	public void costOfCoffe() {
			System.out.println("145/- only");
		
	}
		
}
