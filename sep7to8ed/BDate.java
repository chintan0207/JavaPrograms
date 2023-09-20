package sep7to8ed;

public class BDate {
	
	int dd,mm,yy;
	
	public BDate()
	{
		dd=10;
		mm=11;
		yy=2001;
		
	}

	public BDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void display()
	{
		System.out.println("Birthday Date: " + dd+"/"+mm+"/"+yy);
	}
}
