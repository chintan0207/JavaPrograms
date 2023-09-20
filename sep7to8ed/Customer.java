package sep7to8ed;

public class Customer extends Person {
	
	String prodName,per;
	int price;
	int quantity;
	float billAmount,discount,finalbill;

	public Customer()
	{
		super();
		prodName = "Fan";
        price = 2500;
		quantity = 8;
		
	}
	public Customer(int id, String name, Address address,BDate bdate,String prodName,int price, int quantity)
	{
		super(id,name,address,bdate);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
		
	}
	public void calculate()
	{
		billAmount = price * quantity;
		
		if(billAmount >= 20000) {
			per="15%";
			discount = billAmount *15/100;
			
		}
		else if(billAmount >=15000) {
			per="10%";
			discount = billAmount *10/100;
		}
		else if(billAmount >=10000) {
			per="7%";
			discount = billAmount *7/100;
		}
		else {
			per="0%";
			discount = 0;		
		}
		finalbill = billAmount-discount;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Bill Amount: " + billAmount + "\nDiscount"+"(" +per +"): " + discount + "\nFinal bill Amount: " + finalbill);
	}
	
	
}
