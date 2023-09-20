package sep11edAbstraction;

public abstract class Bike {
	
	public Bike()
	{
		System.out.println("Abstract Class constructor");
	}
	
	public abstract void print();
	
	public void changeGear()
	{
		System.out.println("Changing Gear....");
	}

}
