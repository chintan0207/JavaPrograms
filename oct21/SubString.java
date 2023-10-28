package oct21;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="khushishi";
		String rep_String ="";
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				String x = Longestcommon(s.substring(i,n),s.substring(j,n));
				if(x.length()>rep_String.length())
				{
					rep_String=x;
				}
			}
		}
		System.out.println("The longest substring is" + " " + rep_String);
	}

	public static String Longestcommon(String a,String b)
	{
		int n = Math.min(a.length(), b.length());
		for(int i=0;i<n;i++)
			// I Iteration of i
			// ArunAr runAr
			// ArunAr unAr
			// ArunAr  nAr
			// ArunAr  Ar
			//II Iteration of i
			//runAr unAr
			//runAr nAr
			//runAr Ar
		{
			if(a.charAt(i) != b.charAt(i))
			{
				return a.substring(0,i);
			}
		}
		return a.substring(0,n);
	}
}
