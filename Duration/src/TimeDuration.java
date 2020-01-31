
public class TimeDuration {
	private int s = 0;
	
	public TimeDuration(int second)
	{
		s = second;
	}
	
	public String toString() {
		
		int h = 0;
		int m = 0;
		
		if (s >= 0)
		{
			if (s >= 60)
			{
				m = s / 60;
				s = s % 60;
				
				if (m >= 60)
				{
					h = m / 60;
					m = m % 60;
				}
			}
			
			System.out.println(h + "h " + m + "m " + s + "s ");
			
			return(null);

		}
		
		else
		{
			return null;
		}
		
	}
}
