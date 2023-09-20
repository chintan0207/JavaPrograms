package sep7to8ed;

public class Address {

	String addrLine, street, city, state, country, pincode;
	
	public Address()
	{
		addrLine="202 Laxmi Tower";

		street="Karve Road";

		city="Pune"; 
		
		state="MH";

		country="India";

		pincode = "421301";
	}
	
	public Address(String addrLine,String street,String city,String state,String country,String pincode)
	{
		this.addrLine=addrLine;

		this.street=street;

		this.city=city; 
		
		this.state=state;

		this.country=country;

		this.pincode = pincode;
	}
	
	public void disply() {
		System.out.println("Address: " +addrLine + "," +street +"," + city+","+state+","+country+","+pincode);
	}
}
