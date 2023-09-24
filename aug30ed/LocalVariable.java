package aug30ed;

class Product {
	
	void show(){
		
		int productPrice = 1000;
		String productName = "speaker";
		System.out.println(productPrice + " " + productName);
	}
	
}

public class LocalVariable {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.show();

	}

}
