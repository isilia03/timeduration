
public class RaceResults extends TimeDuration{
	private String RFID;
	private TimeDuration t;
	
	public RaceResults() throws BadBadValueException
	{
		super(0);
		RFID = "";
	}
	
	public RaceResults(String r, int second) throws BadBadValueException
	{
		super(second);
		RFID = r;
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime)
	{
		t = resultTime;
		RFID = tagNumber;
	}
}
