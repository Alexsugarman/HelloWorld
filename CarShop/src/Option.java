public class Option 
{
	public Option(boolean aClimateControl, boolean aGps, boolean anAlarm)
	{
		climateControl = aClimateControl;
		gps = aGps;
		alarm = anAlarm;	
	}
	
	public String getInfo()
	{
		StringBuilder s = new StringBuilder("Options: ");
		if  (climateControl || gps || alarm)
		{
			if (climateControl)
			{
				s.append("Climate Control/");
			}
			if (gps)
			{
				s.append("GPS/");
			}
			if (alarm)
			{
				s.append("Alarm/");
			}
			s.deleteCharAt(s.length()-1);
			return s.toString();
		}
		else
		{
			return "There is no options";
		}
	}
	
	public int getCount()
	{
		int count = 0;
		if (climateControl)
		{
			count++;
		}
		if (gps)
		{
			count++;
		}
		if (alarm)
		{
			count++;
		}
		return count;
	}
	
	private boolean climateControl;
	private boolean gps;
	private boolean alarm;
}
